package com.company.librarymgmt.screen.book;

import io.jmix.ui.screen.*;
import com.company.librarymgmt.entity.Book;

@UiController("Book.edit")
@UiDescriptor("book-edit.xml")
@EditedEntityContainer("bookDc")
public class BookEdit extends StandardEditor<Book> {
}