let pagecurrent = 1;
loadProduct();
function loadProduct(){
    $.ajax({
        url: `/api/sanphams?page=${pagecurrent}&limit=2`,
        method: "GET",
        dataType: "json",
        success: (response) => {
            //console.log(response);
            let col = '';
            $.each(response.data, (index, item) => {
                col += ` <div class="col-6">
                            <a href="/sanphams/${item.slug}">
                                <div class="card" style="width: 18rem;">
                                <img src="/assets/images/sanphams/${item.sanphamhinhanh[0].hinhanh}" class="card-img-top" alt="...">
                                <div class="card-body">
                                    <p class="card-text line-clamp-2">${item.ten}</p>
                                </div>
                            </div>
                            </a>                      
                        </div>`;
            })
            $('#san-pham-trang-chu').html(col);
            $("#pagination").twbsPagination({
                first: "First",
                prev: "Previous",
                next: "Next",
                last: "Last",
                visiblePages: 2,
                totalPages: response.meta.totalpage,
                startPage: response.meta.pagefirst,
                onPageClick: function (event, page) {
                    event.preventDefault();
                    pagecurrent = page;
                    loadProduct();
                },
            });
        },
        error: (error) => {
            console.log(error);
        }
    });
}
