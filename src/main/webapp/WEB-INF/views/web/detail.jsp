<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 10/31/2023
  Time: 1:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container-fluid bg-secondary mb-5">
    <div class="d-flex flex-column align-items-center justify-content-center" style="min-height: 300px">
        <h1 class="font-weight-semi-bold text-uppercase mb-3">Product Detail</h1>
        <div class="d-inline-flex">
            <p class="m-0"><a href="">Home</a></p>
            <p class="m-0 px-2">-</p>
            <p class="m-0">Product Detail</p>
        </div>
    </div>
</div>

<div class="container-fluid py-5">
    <div class="row px-xl-5">
        <div class="col-lg-5 pb-5">
            <img class="w-100" src="<c:url value='/template/web/img/anh2.png'/>" alt="Image">
            <div class="row mt-3">
                <div class="col-3">
                    <img class="w-100" src="<c:url value='/template/web/img/anh2.png'/>" alt="Image">
                </div>
                <div class="col-3">
                    <img class="w-100" src="<c:url value='/template/web/img/anh3.png'/>" alt="Image">
                </div>
                <div class="col-3">
                    <img class="w-100" src="<c:url value='/template/web/img/anh1.png'/>" alt="Image">
                </div>
                <div class="col-3">
                    <img class="w-100" src="<c:url value='/template/web/img/anh4.png'/>" alt="Image">
                </div>
            </div>
        </div>

        <div class="col-lg-7 pb-5 ">
            <div class="khung">
                <h3 class="font-weight-semi-bold">Áo polo nam aelimited</h3>
                <div class="d-flex mb-3">
                    <div class="text-primary mr-2">
                        <small class="fas fa-star"></small>
                        <small class="fas fa-star"></small>
                        <small class="fas fa-star"></small>
                        <small class="fas fa-star-half-alt"></small>
                        <small class="far fa-star"></small>
                    </div>
                    <small class="pt-1">(50 Reviews)</small>
                </div>
                <h3 class="font-weight-semi-bold mb-4">$150.00</h3>
                <div class="d-flex mb-3">
                    <p class="text-dark font-weight-medium mb-0 mr-3">Sizes:</p>
                    <form>
                        <div class="custom-control custom-radio custom-control-inline">
                            <input type="radio" class="custom-control-input" id="size-1" name="size">
                            <label class="custom-control-label" for="size-1">S</label>
                        </div>
                        <div class="custom-control custom-radio custom-control-inline">
                            <input type="radio" class="custom-control-input" id="size-2" name="size">
                            <label class="custom-control-label" for="size-2">M</label>
                        </div>
                        <div class="custom-control custom-radio custom-control-inline">
                            <input type="radio" class="custom-control-input" id="size-3" name="size">
                            <label class="custom-control-label" for="size-3">L</label>
                        </div>
                        <div class="custom-control custom-radio custom-control-inline"><input type="radio" class="custom-control-input" id="size-4" name="size">
                            <label class="custom-control-label" for="size-4">XL</label>
                        </div>
                        <div class="custom-control custom-radio custom-control-inline">
                            <input type="radio" class="custom-control-input" id="size-5" name="size">
                            <label class="custom-control-label" for="size-5">XXL</label>
                        </div>
                    </form>
                </div>
                <div class="d-flex mb-4">
                    <p class="text-dark font-weight-medium mb-0 mr-3">Colors:</p>
                    <form>
                        <div class="custom-control custom-radio custom-control-inline">
                            <input type="radio" class="custom-control-input" id="color-1" name="color">
                            <label class="custom-control-label" for="color-1">Black</label>
                        </div>
                        <div class="custom-control custom-radio custom-control-inline">
                            <input type="radio" class="custom-control-input" id="color-2" name="color">
                            <label class="custom-control-label" for="color-2">White</label>
                        </div>
                        <div class="custom-control custom-radio custom-control-inline">
                            <input type="radio" class="custom-control-input" id="color-3" name="color">
                            <label class="custom-control-label" for="color-3">Red</label>
                        </div>
                        <div class="custom-control custom-radio custom-control-inline">
                            <input type="radio" class="custom-control-input" id="color-4" name="color">
                            <label class="custom-control-label" for="color-4">Blue</label>
                        </div>
                        <div class="custom-control custom-radio custom-control-inline">
                            <input type="radio" class="custom-control-input" id="color-5" name="color">
                            <label class="custom-control-label" for="color-5">Green</label>
                        </div>
                    </form>
                </div>
                <div class="d-flex align-items-center pt-2 mb-4">
                    <p class="text-dark font-weight-medium mb-0 mr-3">Quantity:</p><div class="input-group quantity mr-3" style="width: 130px;">
                    <div class="input-group-btn">
                        <button class="btn btn-primary btn-minus" >
                            <i class="fa fa-minus"></i>
                        </button>
                    </div>
                    <input type="text" class="form-control bg-secondary text-center" value="1">
                    <div class="input-group-btn">
                        <button class="btn btn-primary btn-plus">
                            <i class="fa fa-plus"></i>
                        </button>
                    </div>
                </div>
                    <p class="text-dark mb-0 mr-3">751 sản phẩm có sẵn</p>
                </div>
                <div class="d-flex align-items-center pt-2">
                    <button class="btn btn-secondary px-3"><i class="fa fa-shopping-cart mr-1"></i> Add To Cart</button>
                    <button class="btn btn-primary px-3 ms-3">Mua ngay</button>

                </div>
            </div>

            <div class="khung mt-4">
                <h5>Mô tả sản phẩm</h5>
                <span>Áo thun polo nam thể thao LADOS - 9080 cổ bẻ, chất liệu vải thun lạnh mát mẻ, kiểu dáng DRI-FIT
                Chất liệu: Vải poli lanh, vải thoáng khí mát mẻ
                Co giãn tốt, mặc cực thoải mái, thấm hút mồ hôi tốt
                Chất vải đẹp, đứng form áo
                Đường may cực tỉ mỉ cực đẹp
                Có thể mặc đi chơi, chạy bộ, tậm gym vận động
                Kiểu dáng: Thiết kế theo form rộng vừa,đơn giản , dễ mặc ..Tôn lên được sự trẻ trung năng động cho các bạn nam, kèm vào đó là sự hoạt động thoải mái khi mặc sản phẩm.
                </span>
            </div>

        </div>
    </div>
</div>
<div class="row px-xl-5">
    <div class="col">
        <div class="nav nav-tabs justify-content-center border-secondary mb-4">
            <a class="nav-item nav-link active" data-toggle="tab" href="#tab-pane-2">Information</a>
            <a class="nav-item nav-link" data-toggle="tab" href="#tab-pane-3">Reviews (0)</a>
        </div>
        <div class="tab-content">

            <div class="tab-pane fade show active" id="tab-pane-2">
                <h4 class="mb-3">Thông tin thêm</h4>
                <hr>
                <div class="row">
                    <div class="col-lg-6">
                        <h6>Bảng size bên shop :</h6>
                        <p>Size S: Dành cho người nặng từ 35kg - 41kg < 1m50</p>
                        <p>Size M: Dành cho người nặng từ 42kg - 53kg < 1m63</p>
                        <p>Size L: Dành cho người nặng từ 54kg - 60kg < 1m70</p><p>Size XL: Dành cho người nặng từ 61kg - 69kg < 1m75</p>
                        <p>Size XXL: Dành cho người nặng từ 70kg - 76kg < 1m80</p>
                    </div>
                    <div class="col-lg-6">
                        <h6>CAM KẾT - ĐẢM BẢO:</h6>
                        <p>- Đảm bảo vải chuẩn cotton chất lượng cao.</p>
                        <p>- Hàng có sẵn, giao hàng ngay khi nhận được đơn đặt hàng.</p>
                        <p>- Hoàn tiền 100% nếu sản phẩm lỗi, nhầm hoặc không giống với mô tả.</p>
                        <p>- Chấp nhận đổi hàng khi size không vừa (vui lòng nhắn tin riêng cho shop).</p>
                        <p>- Giao hàng toàn quốc, thanh toán khi nhận hàng.</p>
                        <p>📌 LƯU Ý:  Khi quý khách có gặp bất kì vấn đề gì về sản phẩm và vận chuyển đừng vội đánh giá mà hãy liên hệ Shop để đc hỗ trợ 1 cách tốt nhất nhé.</p>
                    </div>

                </div>



            </div>
            <div class="tab-pane fade" id="tab-pane-3">
                <div class="row">
                    <div class="col-md-6">
                        <h4 class="mb-4">1 review for "Colorful Stylish Shirt"</h4>
                        <div class="media mb-4">
                            <img src="<c:url value='/template/web/img/user.jpg'/>" alt="Image" class="img-fluid mr-3 mt-1" style="width: 45px;">
                            <div class="media-body">
                                <h6>John Doe<small> - <i>01 Jan 2045</i></small></h6>
                                <div class="text-primary mb-2">
                                    <i class="fas fa-star"></i>
                                    <i class="fas fa-star"></i>
                                    <i class="fas fa-star"></i>
                                    <i class="fas fa-star-half-alt"></i>
                                    <i class="far fa-star"></i>
                                </div>
                                <p>Diam amet duo labore stet elitr ea clita ipsum, tempor labore accusam ipsum et no at. Kasd diam tempor rebum magna dolores sed sed eirmod ipsum.</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <h4 class="mb-4">Leave a review</h4>
                        <small>Your email address will not be published. Required fields are marked *</small>
                        <div class="d-flex my-3">
                            <p class="mb-0 mr-2">Your Rating * :</p>
                            <div class="text-primary">
                                <i class="far fa-star"></i>
                                <i class="far fa-star"></i><i class="far fa-star"></i>
                                <i class="far fa-star"></i>
                                <i class="far fa-star"></i>
                            </div>
                        </div>
                        <form>
                            <div class="form-group">
                                <label for="message">Your Review *</label>
                                <textarea id="message" cols="30" rows="5" class="form-control"></textarea>
                            </div>
                            <div class="form-group">
                                <label for="name">Your Name *</label>
                                <input type="text" class="form-control" id="name">
                            </div>
                            <div class="form-group">
                                <label for="email">Your Email *</label>
                                <input type="email" class="form-control" id="email">
                            </div>
                            <div class="form-group mb-0">
                                <input type="submit" value="Leave Your Review" class="btn btn-primary px-3">
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</div>

</body>
</html>