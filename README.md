Link github: https://github.com/thinhotwp1/VisitorPattern.git
Link drive: https://docs.google.com/document/d/1Gs1samqYMol5vYfhRGnREirVLRjaaNVof1PDqekRYvA/edit?usp=sharing


Code trên sử dụng pattern Visitor để tách các hoạt động và tính năng của các đối tượng ra khỏi đối tượng đó. Điều này giúp cho hệ thống trở nên dễ bảo trì, mở rộng và tái sử dụng.
Khi thêm một hoặc nhiều tính năng mới vào hệ thống, chúng ta không cần phải sửa đổi cấu trúc của các đối tượng đã có trong hệ thống. Thay vào đó, chúng ta chỉ cần thêm một visitor mới để thực hiện các hoạt động đó trên các đối tượng đó.

Việc sử dụng pattern Visitor cũng giúp cho hệ thống trở nên linh hoạt hơn khi có nhiều loại đối tượng khác nhau cần phải xử lý. Chúng ta có thể tạo nhiều visitor khác nhau để thực hiện các hoạt động khác nhau trên các đối tượng khác nhau mà không cần phải thay đổi cấu trúc của đối tượng đó.

Tóm lại, việc sử dụng pattern Visitor giúp cho hệ thống trở nên linh hoạt, dễ bảo trì, mở rộng và tái sử dụng bằng cách tách các hành động ra thành các class riêng để tránh sửa đổi các class cũ, khi cần thêm 1 hành động mới thì tạo một 1 class NewActionVisitor và implements các method của từng đối tượng 

Dưới đây là một số ví dụ sử dụng pattern Visitor:

Trong một ứng dụng văn bản, ta có thể sử dụng Visitor pattern để thực hiện các hoạt động khác nhau trên các phần tử khác nhau của tài liệu văn bản như chữ in đậm, chữ nghiêng, xuất bản tài liệu dưới dạng PDF, HTML, v.v.

Ví dụ sẽ làm ở github:
Trong một trò chơi điện tử, ta có thể sử dụng Visitor pattern để thực hiện các hoạt động khác nhau trên các đối tượng khác nhau trong trò chơi như quái vật, vật phẩm, nhân vật, v.v.
