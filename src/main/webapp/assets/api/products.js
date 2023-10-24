$(".btn-add-product").on("click", function (event) {
    event.preventDefault();
    let data = getDataFromForm();
    //callAjaxSanPham(data);
    // console.log(data);
    // console.log(images);
    // console.log(valueAttributes);
    const variants = getVariants();
    // console.log(variants);

    let dataAllResponse = {};
    dataAllResponse['sanpham'] = data;
    dataAllResponse['sanphamhinhanh'] = images;
    dataAllResponse['thuoctinh'] = valueAttributes;
    dataAllResponse['bienthe'] = variants;

    console.log(dataAllResponse);

    $.ajax({
        url: "/api/sanphams",
        method: "POST",
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        data: JSON.stringify(dataAllResponse),
        success: (response) => {

        },
        error: (error) => {
            console.log(error);
        }
    });
});

function getDataFromForm() {
    let dataFromForm = $(".form-submit-product").serializeArray();
    let data = {};
    $.each(dataFromForm, (index, value) => {
        let propertyName = value.name;
        let propertyValue = value.value;
        if (propertyName === "chitietsanpham") {
            propertyValue = CKEDITOR.instances.chitietsanpham.getData();
        }

        if (propertyName === "motasanpham") {
            propertyValue = CKEDITOR.instances.motasanpham.getData();
        }
        data[propertyName] = propertyValue;
    });
    return data;
}

function getVariants(sanphamid){
    let variants = [];
    $(".table-variant-body tr").each((index, item) => {
        const ten = item.querySelector('.ten').textContent;
        let gia = null;
        if (item.querySelector('.gia').value !== null) {
            gia = item.querySelector('.gia').value
        }
        let hinhanh = null;
        let hinhanhbase64 = null;
        if (item.querySelector('.hinhanh') && item.querySelector('.hinhanh').files.length > 0) {
            hinhanh = item.querySelector('.hinhanh').files[0].name;
            hinhanhbase64 = item.querySelector('.hinhanhbase64').src;
        }
        let data = {};
        data['ten'] = ten;
        data['gia'] = gia;
        data['hinhanh'] = hinhanh;
        data['hinhanhbase64'] = hinhanhbase64;
        data['sanphamid'] = sanphamid;
        variants.push(data);
    });
    return variants;
}

function callAjaxSanPham(dataresponse){
    $.ajax({
        url: "/api/sanphams",
        method: "POST",
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        data: JSON.stringify(dataresponse),
        success: (response) => {
            //messageNotication(createdProductSuccess, "rgb(3, 138, 255)");
            let dataresponse = [];
            const sanphamid = response.id;
            for(const image of images){
                let data = {};
                data['sanphamid'] = sanphamid;
                data['hinhanh'] = image.hinhanh;
                data['hinhanhbase64'] = image.hinhanhbase64;
                dataresponse.push(data);
            }
            callAjaxSanPhamHinhAnh(dataresponse);

            for (const attribute of valueAttributes){
                let data = {};
                data['sanphamid'] = sanphamid;
                data['slug'] = attribute.slug;
                data['ten'] = attribute.ten;

                $.ajax({
                        url: "/api/thuoctinhs",
                        method: "POST",
                        contentType: "application/json; charset=utf-8",
                        dataType: "json",
                        data: JSON.stringify(data),
                        success: (response) => {

                            const giatrithuoctinhid = response.id;
                            for(const value of attribute.giatri){
                                let data = {};
                                data['sanphamid'] = sanphamid;
                                data['thuoctinhid'] = giatrithuoctinhid;
                                data['giatri'] = value;

                                //console.log(data);
                                callAjaxGiaTriThuocTinh(data);
                            }
                        },
                        error: (error) => {
                           console.log(error);
                        }
                });
            }

            const variants = getVariants(sanphamid);
            callAjaxBienThe(variants);
            //messageNotication(createdProductSuccess, "rgb(3, 138, 255)");
        },
        error: (error) => {
            console.log(error);
            messageNotication(error.responseJSON.error, "rgba(255, 99, 71, 1)");
        }
    });
}

function callAjaxSanPhamHinhAnh(dataresponse) {
    $.ajax({
        url: "/api/sanphamhinhanhs",
        method: "POST",
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        data: JSON.stringify(dataresponse),
        success: (response) => {
            //console.log(response);
        },
        error: (error) => {
            console.log(error);
        }
    });
}

function callAjaxGiaTriThuocTinh(dataresponse){
    $.ajax({
        url: "/api/giatrithuoctinhs",
        method: "POST",
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        data: JSON.stringify(dataresponse),
        success: (response) => {
            //console.log(response);
        },
        error: (error) => {
            console.log(error);
        }
    });
}

function callAjaxBienThe(dataresponse){
    $.ajax({
        url: "/api/bienthes",
        method: "POST",
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        data: JSON.stringify(dataresponse),
        success: (response) => {
            //console.log(response);
        },
        error: (error) => {
            console.log(error);
        }
    });
}

