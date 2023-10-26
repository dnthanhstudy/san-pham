$.ajax({
    url: "/api/sanphams/ao-polo-form-rong-tay-lo-crhsur",
    method: "GET",
    dataType: "json",
    success: (response) => {
        let image = `<img style="width: 100%" src="/assets/images/sanphams/${response.sanphamhinhanh[0].hinhanh}" alt="">`;
       $('.image').append(image);
       $('.name').append(response.ten);
       $('.gia').append(response.gia);

       $.each(response.thuoctinh, (index, item) => {
           let thuoctinh = `<p>${item.ten}</p>`;
           $.each(item.giatrithuoctinh, (idx, it) => {
               thuoctinh += `<input type="radio"/>${it.giatri}`;
           })
           $('.thuoc-tinh').append(thuoctinh);
       })
    },
    error: (error) => {
        console.log(error);
    }
});