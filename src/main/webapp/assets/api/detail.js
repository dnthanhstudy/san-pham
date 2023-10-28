const pathNameOfUrl = window.location.pathname;
const splits = pathNameOfUrl.split('/');
let slug = splits[splits.length - 1];

$.ajax({
    url: `/api/sanphams/${slug}`,
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
               thuoctinh += `<input type="radio" value="${it.id}"/>${it.giatri}`;
           })
           $('.thuoc-tinh').append(thuoctinh);
       })
    },
    error: (error) => {
        //console.log(error);
        //window.location.href = "/not-found";
    }
});