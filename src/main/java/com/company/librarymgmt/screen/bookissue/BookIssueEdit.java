package com.company.librarymgmt.screen.bookissue;

import io.jmix.ui.screen.*;
import com.company.librarymgmt.entity.BookIssue;

@UiController("BookIssue.edit")
@UiDescriptor("book-issue-edit.xml")
@EditedEntityContainer("bookIssueDc")
public class BookIssueEdit extends StandardEditor<BookIssue> {
}