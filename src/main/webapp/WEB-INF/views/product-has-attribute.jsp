<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Bootstrap demo</title>
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
            crossorigin="anonymous"
    />
    <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css"
            integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA=="
            crossorigin="anonymous"
            referrerpolicy="no-referrer"
    />
    <link href="<c:url value='/assets/css/toastify.css'/>" rel="stylesheet" />
</head>
<body>

    <div class="container mt-3">
    <form action="" method="POST" class="form-submit-product">
        <div class="row">
            <label class="form-label">Chọn hình ảnh</label>
            <input type="file" id="uploadImage" />
            <div class="list-images mt-4">

            </div>
        </div>
        <div class="row mt-4">
            <div class="col-4">
                <label for="slug" class="form-label">Slug</label>
                <input name="slug" type="text" class="form-control" id="slug" />
            </div>

            <div class="col-4">
                <label for="ten" class="form-label">Tên</label>
                <input name="ten" type="text" class="form-control" id="ten" />
            </div>

            <div class="col-4">
                <label for="gia" class="form-label">Giá</label>
                <input name="gia" type="text" class="form-control" id="gia" />
            </div>

            <div class="col-6 mt-4 mb-4">
                <label for="chitietsanpham" class="form-label"
                >Chi tiết sản phẩm</label
                >
                <textarea
                        class="form-control"
                        id="chitietsanpham"
                        name="chitietsanpham"
                ></textarea>
            </div>

            <div class="col-6 mt-4 mb-4">
                <label for="motasanpham" class="form-label">Mô tả sản phẩm</label>
                <textarea
                        class="form-control"
                        id="motasanpham"
                        name="motasanpham"
                ></textarea>
            </div>

            <div class="col-6">
                <select class="form-select" name="danhmucslug">
                    <option selected>Vui lòng chọn danh mục</option>
                    <option value="thoi-trang-tre-em">Thời trang trẻ em</option>
                    <option value="thoi-trang-nam">Thời trang nam</option>
                </select>
            </div>

            <div class="col-6">
                <select class="form-select" name="thuonghieuslug">
                    <option selected>Vui lòng chọn thương hiệu</option>
                    <option value="adidas">Adidas</option>
                    <option value="nike">Nike</option>
                </select>
            </div>
        </div>

        <div class="row mt-4 mb-4">
            <div class="col-6">
                <div class="card">
                    <div
                            class="d-flex justify-content-between align-items-center card-header"
                    >
                        <p>Thuộc tính</p>
                        <div class="col-4">
                            <div class="input-group">
                                <input
                                        type="text"
                                        class="form-control input-name-atrribute"
                                        placeholder="Nhập thuộc tính"
                                />
                            </div>
                        </div>
                    </div>
                    <div class="card-body">
                        <p class="card-text card-text-none-attribute">
                            Chưa có thuộc tính
                        </p>
                    </div>
                </div>
            </div>

            <div class="col-6">
                <div class="card">
                    <div
                            class="d-flex justify-content-between align-items-center card-header"
                    >
                        <p>Biến thể</p>
                    </div>
                    <div class="card-body">
                        <div class="row mb-4 d-flex align-items-center">
                            <div class="col-8">
                                <div class="input-group">
                                    <input
                                            type="text"
                                            class="form-control"
                                            placeholder="Thiết lập giá cho tất cả thuộc tính"
                                    />
                                    <button
                                            class="btn btn-primary"
                                            type="button"
                                            id="btn-search"
                                    >
                                        Xác nhận!
                                    </button>
                                </div>
                            </div>

                            <div class="col-4">
                                <div class="dropdown">
                                    <button
                                            class="btn btn-info dropdown-toggle"
                                            type="button"
                                            data-bs-toggle="dropdown"
                                            aria-expanded="false"
                                    >
                                        Thuộc tính
                                    </button>
                                    <ul class="dropdown-menu">
                                        <li><a class="dropdown-item" href="#">Action</a></li>
                                        <li>
                                            <a class="dropdown-item" href="#">Another action</a>
                                        </li>
                                        <li>
                                            <a class="dropdown-item" href="#"
                                            >Something else here</a
                                            >
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <table class="table table-bordered table-variant">
                            <thead>
                            <tr>
                                <th class="text-center" scope="col">Tên biến thể</th>
                                <th class="text-center" scope="col">Giá</th>
                                <th class="text-center" scope="col">Chọn hình ảnh</th>
                            </tr>
                            </thead>
                            <tbody class="table-variant-body"></tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>

        <button type="button" class="btn btn-success mt-4 mb-4 btn-add-product">Submit</button>
    </form>
</div>

    <script
            src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
            crossorigin="anonymous"
    ></script>
    <script
            src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js"
            integrity="sha512-v2CJ7UaYy4JwqLDIrZUI/4hqeoQieOmAZNXBeQyjo21dadnwR+8ZaIJVT8EE2iyI61OV8e6M8PP2/4hpQINQ/g=="
            crossorigin="anonymous"
            referrerpolicy="no-referrer"
    ></script>
    <script src="<c:url value='/assets/js/change-image.js'/>"></script>
    <script src="<c:url value='/template/ckeditor/ckeditor.js'/>"></script>
    <script>
        let ckeChiTietSanPham = CKEDITOR.replace("chitietsanpham");
        let ckeMoTaSanPham = CKEDITOR.replace("motasanpham");
    </script>
    <script src="<c:url value='/assets/js/toastify.js'/>"></script>
    <script src="<c:url value='/assets/js/defined.js'/>"></script>
    <script src="<c:url value='/assets/js/product-attribute.js'/>"></script>
    <script src="<c:url value='/assets/api/products.js'/>"></script>
</body>
</html>
