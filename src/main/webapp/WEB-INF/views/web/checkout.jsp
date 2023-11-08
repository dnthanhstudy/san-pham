<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<button type="button" class="btn btn-lg btn-danger"
        data-bs-toggle="popover" title="Popover title" data-bs-html="true"
        data-bs-content="<b><i>Văn bản in đậm và in nghiêng</i></b>"
        data-bs-placement="bottom">
    Click to toggle popover</button>

<div class="modal fade" id="btnalldiachi" aria-hidden="true" aria-labelledby="exampleModalToggleLabel"  >
    <div class="modal-dialog modal-xl modal-dialog-centered">
        <div class="modal-content" >
            <div class="modal-header">
                <h1 class="modal-title fs-5" id="exampleModalToggleLabel">Địa chỉ của tôi</h1>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body" style="height: 450px; overflow-y: scroll;">
                <div class="row" id="alldiachi">
                    <div class="col-10">
                        <div class="ms-3" style="border-bottom: #6C757D">
                            <input class="form-check-input" type="radio" name="radioNoLabel" id="radioNoLabel1" value="" aria-label="...">
                            <div class="hstack gap-3 ms-3">
                                <div>
                                    <span class="text-dark">Khánh Linh</span>
                                </div>
                                <div class="vr" style="height: 30px"></div>
                                <div >
                                    <span class="">0987654321</span>
                                </div>
                            </div>
                            <div class="ms-3">
                                <p class="">Xóm yên lương, Xã Ngọc Lương, Huyện Yên Thủy, Hòa Bình</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-2">
                        <a class="text-decoration-none" style="color: #00aced" data-bs-target="#formdiachi" data-bs-toggle="modal">Cập nhật</a>
                    </div>

                </div>
                <button class="btn btn-light" onclick="themDiaChi()" data-bs-target="#formdiachi" data-bs-toggle="modal" >
                    <svg xmlns="http://www.w3.org/2000/svg" height="1em" viewBox="0 0 448 512">
                        <path d="M256 80c0-17.7-14.3-32-32-32s-32 14.3-32 32V224H48c-17.7 0-32 14.3-32 32s14.3 32 32 32H192V432c0 17.7 14.3 32 32 32s32-14.3 32-32V288H400c17.7 0 32-14.3 32-32s-14.3-32-32-32H256V80z"/>
                    </svg>
                    Thêm địa chỉ mới</button>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-light" data-bs-dismiss="modal">Hủy</button>
                <button type="button" class="btn btn-danger" data-bs-dismiss="modal">Xác nhận</button>
            </div>
        </div>
    </div>
</div>
<div class="modal fade" id="formdiachi" aria-hidden="true" aria-labelledby="exampleModalToggleLabel2" style="overflow:hidden;">
    <div class="modal-dialog modal-dialog-centered">
        <div class="modal-content">
            <div class="modal-header">
                <h1 class="modal-title fs-5" id="exampleModalToggleLabel2">Cập nhật địa chỉ</h1>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <div class="row">
                    <div class="col-6">
                        <div class="mb-3">
                            <label  class="form-label">Tên người nhận</label>
                            <input type="text" class="form-control" id="tennguoinhanform">
                        </div>
                    </div>
                    <div class="col-6">
                        <div class="mb-3">
                            <label class="form-label">Số điện thoại</label>
                            <input type="text" id="sdtform" class="form-control" >
                        </div>
                    </div>
                    <div class="col-12">
                        <div class="mb-3">
                            <label class="form-label">Thành phố</label>
                            <select style="width: 100%" class="form-control" id="thanhpho"></select>
                        </div>
                    </div>
                    <div class="col-6">
                        <div class="mb-3">
                            <label class="form-label">Quận/Huyện</label>
                            <select class="form-control " style="width: 100%" id="quanhuyen"></select>
                        </div>
                    </div>
                    <div class="col-6">
                        <div class="mb-3">
                            <label class="form-label">Xã</label>
                            <select class="form-control" style="width: 100%" id="xa"></select>
                        </div>
                    </div>
                    <div class="col-12">
                        <div class="mb-3">
                            <label class="form-label">Số nhà</label>
                            <textarea class="form-control" id="sonha" rows="3"></textarea>
                        </div>
                    </div>
                    <div class="col-6">
                        <div class="form-check">
                            <input class="form-check-input" type="checkbox" value="true"  id="defaultform">
                            <label class="form-check-label" >
                                Đặt làm địa chỉ mặc định
                            </label>
                        </div>
                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <button class="btn btn-light" data-bs-target="#exampleModalToggle" data-bs-toggle="modal">Trở lại</button>
                <button class="btn btn-danger" data-bs-target="#exampleModalToggle" data-bs-toggle="modal" onclick="hoanThanh()">Hoàn thành</button>
            </div>
        </div>
    </div>
</div>


<!-- Link to open the modal -->
    <!-- Page Header Start -->
    <div class="container-fluid bg-secondary mb-5">
        <div class="d-flex flex-column align-items-center justify-content-center" style="min-height: 300px">
            <h1 class="font-weight-semi-bold text-uppercase mb-3">Checkout</h1>
            <div class="d-inline-flex">
                <p class="m-0"><a href="">Home</a></p>
                <p class="m-0 px-2">-</p>
                <p class="m-0">Checkout</p>
            </div>
        </div>
    </div>

    <!-- Page Header End -->
<div class="container-fluid row pl-5" >
    <div class="col-12 mb-2"><h3 >Thông tin mua hàng</h3></div>
    <div class="col-3"><strong id="tennguoinhan"></strong></div>
    <div class="col-2"><p id="sdt"></p></div>
    <div class="col-4"><p id="diachi"></p></div>
    <div class="col-1"><p id="df">Mặc định</p></div>
    <div class="col-1"><button class="btn btn-primary" data-bs-target="#btnalldiachi" data-bs-toggle="modal">Thay đổi</button>
    </div>
</div>
    <!-- Checkout Start -->
    <div class="container-fluid pt-5 pl-4">

        <div class="table-responsive">
            <table class="table" id="tblcheckout">
                <thead>
                <tr>
                    <th scope="col" class="border-0 bg-light">
                        <div class="p-2 px-2 text-uppercase">Product</div>
                    </th>
                    <th scope="col" class="border-0 bg-light">
                        <div class="py-2 text-uppercase">Loại sản phẩm</div>
                    </th>
                    <th scope="col" class="border-0 bg-light">
                        <div class="py-2 text-uppercase">Price</div>
                    </th>
                    <th scope="col" class="border-0 bg-light">
                        <div class="py-2 text-uppercase">Quantity</div>
                    </th>
<%--                    <th scope="col" class="border-0 bg-light">--%>
<%--                        <div class="py-2 text-uppercase">Remove</div>--%>
<%--                    </th>--%>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <th class="border-0">
                        <div class="p-2">
                            <img src="https://product.hstatic.net/200000323177/product/momo_shirt__3__8e0d45a718ee4d5ea9dbc036db3185e6_large.jpg" alt="" width="70" class="img-fluid rounded shadow-sm">
                            <div class="ml-3 d-inline-block align-middle">
                                <h5 class="mb-0"> <a href="#" class="text-dark d-inline-block align-middle">Timex Unisex Originals</a></h5><span class="text-muted font-weight-normal font-italic d-block">Category: Watches</span>
                            </div>
                        </div>
                    </th>
                    <td class="border-0 align-middle"><strong>Loại sản phẩm</strong></td>
                    <td class="border-0 align-middle"><strong>$79.00</strong></td>
                    <td class="border-0 align-middle"><strong>3</strong></td>
                    <td class="border-0 align-middle"><a href="#" class="text-dark"><i class="fa fa-trash"></i></a></td>
                </tr>
                <tr>
                    <th scope="row">
                        <div class="p-2">
                            <img src="https://product.hstatic.net/1000341630/product/kmsh220633_75cb0c2945474917b2528e802806fb39_master.jpg" alt="" width="70" class="img-fluid rounded shadow-sm">
                            <div class="ml-3 d-inline-block align-middle">
                                <h5 class="mb-0"><a href="#" class="text-dark d-inline-block">Lumix camera lense</a></h5><span class="text-muted font-weight-normal font-italic">Category: Electronics</span>
                            </div>
                        </div>
                    </th>
                    <td class="border-0 align-middle"><strong>Loại sản phẩm</strong></td>
                    <td class="align-middle"><strong>$79.00</strong></td>
                    <td class="align-middle"><strong>3</strong></td>
                    <td class="align-middle"><a href="#" class="text-dark"><i class="fa fa-trash"></i></a>
                    </td>
                </tr>
                <tr>
                    <th scope="row">
                        <div class="p-2">
                            <img src="https://media.coolmate.me/cdn-cgi/image/quality=80,format=auto/uploads/January2022/3recyw2_3.jpg" alt="" width="70" class="img-fluid rounded shadow-sm">
                            <div class="ml-3 d-inline-block align-middle">
                                <h5 class="mb-0"> <a href="#" class="text-dark d-inline-block">Gray Nike running shoe</a></h5><span class="text-muted font-weight-normal font-italic">Category: Fashion</span>
                            </div>
                        </div>
                    </th>
                    <td class="border-0 align-middle"><strong>Loại sản phẩm</strong></td>
                    <td class="align-middle"><strong>$79.00</strong></td>
                    <td class="align-middle"><strong>3</strong></td>
                    <td class="align-middle"><a href="#" class="text-dark"><i class="fa fa-trash"></i></a>
                    </td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
<div class="container text-center">
    <h2>Tổng tiền</h2>
    <p id="total"></p>
    <p id="totaldola"></p>
    <form action="${pageContext.request.contextPath}/pay" method="post">
        <input type="hidden" name="method" value="paypal">
        <input type="hidden" name="intent" value="sale">
        <input type="hidden" name="currency" value="USD">
        <input type="hidden" name="description" value="Product Description">
        <input type="hidden" name="price" id="pricethanhtoan" value="10.00">
        <button type="submit">Thanh toán</button>
    </form>
</div>
    <!-- Checkout End -->
<input type="text" id="idttmuahang" style="display: none;">
<!-- Styles -->

<script>
    var popoverTriggerList = [].slice.call(document.querySelectorAll('[data-bs-toggle="popover"]'))
    var popoverList = popoverTriggerList.map(function (popoverTriggerEl) {
        return new bootstrap.Popover(popoverTriggerEl)
    })
    var idtt = -1;
    const formatter = new Intl.NumberFormat('en-US', {
        style: 'currency',
        currency: 'USD',
    });
    function themDiaChi(){
        idtt = -1;
        $("#tennguoinhanform").val('');
        $("#sdtform").val(''),
            $("#thanhpho").val(1).trigger('change.select2'),
        $("#quanhuyen").val(1).trigger('change.select2'),
        $("#xa").val(1).trigger('change.select2'),
            $("#sonha").val(''),
            $("#defaultform").prop('checked', true);
    }
    function hoanThanh(){
        if (idtt==-1){
            themDiaChiForm();
        }else{
            capNhatDiaChiForm()
        }
    }

    function capNhatDiaChiForm(){
        var idttmuahang  = idtt;
            var diaChi = $("#sonha").val()+getText($("#xa :selected"))+getText($("#quanhuyen :selected"))+getText($("#thanhpho :selected"));
            var data = diaChiForm();
            $.ajax({
                url: '/api/user/ttgh/update/'+idttmuahang,
                method: 'POST',
                contentType: 'application/json',
                data: data,
                success: function(response) {
                    dsthongtinmuahang()
                    getAddressDefault()
                    showSuccess(response.data);
                },
                error: function(xhr, status, error) {
                    showError('Có lỗi xảy ra: ' + error);
                }
            });
    }
    function getText(val){
        var data = val.text();
        return ", "+ data;
    }
    function diaChiForm(){
        var diaChi = $("#sonha").val()+getText($("#xa :selected"))+getText($("#quanhuyen :selected"))+getText($("#thanhpho :selected"))+", Vietnam";
        return JSON.stringify({
            tenNguoiNhan: $("#tennguoinhanform").val(),
            soDienThoai : $("#sdtform").val(),
            idThanhPho : $("#thanhpho").val(),
            idHuyen : $("#quanhuyen").val(),
            idXa : $("#xa").val(),
            soNha : $("#sonha").val(),
            diaChi:diaChi,
            macDinh : $("#defaultform").val()
        });
    }
    function themDiaChiForm(){
        var data = diaChiForm();
        $.ajax({
            url: '/api/user/ttgh/insert/1',
            method: 'POST',
            contentType: 'application/json',
            data: data,
            success: function(response) {
                dsthongtinmuahang()
                getAddressDefault()
                showSuccess(response.data);
            },
            error: function(xhr, status, error) {
                showError('Có lỗi xảy ra: ' + error);
            }
        });

    }

    async function findHuyen(idThanhPho) {
       await $.ajax({
            url: '/api/user/ttgh/huyen/'+idThanhPho,
            method: 'GET',
            success: function(req) {
                var data = req.data;
                var huyen =  $("#quanhuyen")
                huyen.empty();
                data.forEach(function (param) {
                    huyen.append($('<option>', {
                        value: param.DistrictID,
                        text: param.DistrictName
                    }));
                })
                huyen.select2({
                    dropdownParent: $('#formdiachi')
                });
                findXa(data[0].DistrictID);

            },
            error: function(xhr, status, error) {
                showError("Có lỗi xảy ra")
            }
        });
    }
    async function findXa(idHuyen) {
      await  $.ajax({
            url: '/api/user/ttgh/xa/'+idHuyen,
            method: 'GET',
            success: function(req) {
                var data = req.data;
                var xa =  $("#xa")
                xa.empty();
                // data = data.sort((a,b)=> (order.indexOf(a.ProvinceName) - order.indexOf(b.ProvinceName)))
                data.forEach(function (param) {
                    xa.append($('<option>', {
                        value: param.WardCode,
                        text: param.WardName
                    }));
                })
                xa.select2({
                    dropdownParent: $('#formdiachi')
                });
                xa.trigger("change")
            },
            error: function(xhr, status, error) {
                showError("Có lỗi xảy ra")
            }
        });
    }
    $('#thanhpho').on('change', async function () {
        var value = $(this).val()
        await findHuyen(value);

    });
        $('#quanhuyen').on('change',async function() {
            var value = $(this).val()
           await findXa(value);

        });
        //Hiển thị thông tin mua hàng mặc định
   function getAddressDefault(){
       $.ajax({
           url: '/api/user/ttgh/default/'+1,
           method: 'GET',
           success: function(req) {
               var data = req.data;
               $("#idttmuahang").html(data.id);
               $("#tennguoinhan").html(data.tenNguoiNhan);
               $("#sdt").html(data.soDienThoai);
               $("#diachi").html(data.diaChi);
           },
           error: function(xhr, status, error) {
               showError("Có lỗi xảy ra")
           }
       });
   }
    getAddressDefault()
//Thành phố
    $.ajax({
        url: '/api/user/ttgh/thanhpho',
        method: 'GET',
        success: function(req) {
            var data = req.data;
            var thanhpho =  $("#thanhpho")
            thanhpho.empty();
            // data = data.sort((a,b)=> (order.indexOf(a.ProvinceName) - order.indexOf(b.ProvinceName)))
            data.forEach(function (param) {
                thanhpho.append($('<option>', {
                    value: param.ProvinceID,
                    text: param.ProvinceName
                }));
            })
            $('#thanhpho').select2({
                dropdownParent: $('#formdiachi')
            });
        },
        error: function(xhr, status, error) {
            showError("Có lỗi xảy ra")
        }
    });


    function findThongTin(idttmh){
        idtt = idttmh;
        $.ajax({
            url: '/api/user/ttgh/findThongTinMuaHangById/'+idtt,
            method: 'GET',
            success: async function (req) {
                var data = req.data;
                $("#tennguoinhanform").val(data.tenNguoiNhan);
                $("#sdtform").val(data.sdt),
                    $("#thanhpho").val(data.idThanhPho).change(),
                    await findHuyen(data.idThanhPho);
                  $("#quanhuyen").val(data.idHuyen).change(),
                    await findXa(data.idHuyen);
                    $("#xa").val(data.idXa).change(),
                    $("#sonha").val(data.soNha),
                    $("#defaultform").prop( "checked", data.macDinh )
            },
            error: function(xhr, status, error) {
                showError("Có lỗi xảy ra")
            }
        });
    }
    function  dsthongtinmuahang (){
        $.ajax({
            url: '/api/user/ttgh/dsthongtingiaohang/'+1,
            method: 'GET',
            success: function(req) {
                var diachi = $("#alldiachi");
                diachi.empty();
                req.data.forEach(function (data){
                    var html= `
           <div class="col-10">
                        <div class="ms-3" style="border-bottom: #6C757D">
                            <input class="form-check-input" type="radio" name="radioNoLabel" id="radioNoLabel1" value="" aria-label="...">
                            <div class="hstack gap-3 ms-3">
                                <div>
                                    <span class="text-dark">\${data.tenNguoiNhan}</span>
                                </div>
                                <div class="vr" style="height: 30px"></div>
                                <div >
                                    <span class="">\${data.sdt}</span>
                                </div>
                            </div>
                            <div class="ms-3">
                                <p class="">\${data.diaChi}</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-2">
                        <button class="text-decoration-none" style="color: #00aced" onclick="findThongTin(\${data.id})" data-bs-target="#formdiachi" data-bs-toggle="modal">Cập nhật</button>
                    </div>
           `;
                    diachi.append(html);
                })
            },
            error: function(xhr, status, error) {
                alert('Có lỗi xảy ra: ' + error);
            }
        });
    }
    dsthongtinmuahang();
    // function ghct(){
    //     $.ajax({
    //         url: '/api/user/ghct/'+1,
    //         method: 'GET',
    //         success: function(req) {
    //             var data = req.data;
    //
    //             var tbody =$("#tblcheckout tbody");
    //             tbody.empty();
    //             data.forEach(function (custom){
    //                 var idgh = custom.gioHangChiTietId.idGioHang;
    //                 var sp = custom.sanPham;
    //                 var html = `
    //                               <tr>
    //                 <th class="border-0">
    //                     <div class="p-2">
    //                         <img src="https://product.hstatic.net/200000323177/product/momo_shirt__3__8e0d45a718ee4d5ea9dbc036db3185e6_large.jpg" alt="" width="70" class="img-fluid rounded shadow-sm">
    //                         <div class="ml-3 d-inline-block align-middle">
    //                             <h5 class="mb-0"> <a href="#" class="text-dark d-inline-block align-middle">\${sp.tenSanPham}</a></h5><span class="text-muted font-weight-normal font-italic d-block">Category: Watches</span>
    //                         </div>
    //                     </div>
    //                 </th>
    //                 <td class="border-0 align-middle"><strong>Loại sản phẩm</strong></td>
    //                 <td class="border-0 align-middle"><strong>\${convertVND(custom.tongTien)}</strong></td>
    //                 <td class="border-0 align-middle"><strong>\${custom.soLuong}</strong></td>
    //                 <td class="border-0 align-middle"><a href="#" class="text-dark"><i class="fa fa-trash"></i></a></td>
    //             </tr>
    //                 `;
    //                 tbody.append(html);
    //             })
    //
    //         },
    //         error: function(xhr, status, error) {
    //             alert('Có lỗi xảy ra: ' + error);
    //         }
    //     });
    // }
    //
    //     $.ajax({
    //         url: '/api/user/ghct/subtotal/'+1,
    //         method: 'GET',
    //         success: function(req) {
    //             var data = req.data;
    //           //  $("#subtotal").html(convertVND(data));
    //             $("#total").html(convertVND(data))
    //             $("#totaldola").html(formatter.format(data/24570));
    //             $("#pricethanhtoan").val(data/24570);
    //         },
    //         error: function(xhr, status, error) {
    //             alert('Có lỗi xảy ra: ' + error);
    //         }
    //     });
    //
    // ghct()
</script>