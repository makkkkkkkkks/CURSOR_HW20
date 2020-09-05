$(document).ready(function () {
    $(' .nBtn, .table .eBtn').on('click', function (event) {
        event.preventDefault();
        var href = $(this).attr('href');
        var text = $(this).text();
        if (text == 'Edit' ) {

            $.get(href, function (notebook, status) {
                $('.myForm #id').val(notebook.id);
                $('.myForm #model').val(notebook.model);
                $('.myForm #producer').val(notebook.producer);
                $('.myForm #processor').val(notebook.processor);
                $('.myForm #memory').val(notebook.memory);
                $('.myForm #usedUnused').val(notebook.usedUnused);
                $('.myForm #typeBox').val(notebook.typeBox);
                $('.myForm #price').val(notebook.price);
            });

            $('.myForm #exampleModal').modal();
        } else {
            $('.myForm #id').val('');
            $('.myForm #model').val('');
            $('.myForm #producer').val('');
            $('.myForm #processor').val('');
            $('.myForm #memory').val('');
            $('.myForm #usedUnused').val('');
            $('.myForm #typeBox').val('');
            $('.myForm #price').val('');
            $('.myForm #exampleModal').modal();
        }
    });

    $('.table .delBtn').on('click', function (event) {
        event.preventDefault();
        var href = $(this).attr('href');
        $('#myModal #delRef').attr('href', href);
        $('#myModal').modal();
    });
});