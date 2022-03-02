package com.company.librarymgmt.screen.bookissue;

import io.jmix.ui.screen.*;
import com.company.librarymgmt.entity.BookIssue;

@UiController("BookIssue.browse")
@UiDescriptor("book-issue-browse.xml")
@LookupComponent("bookIssuesTable")
public class BookIssueBrowse extends StandardLookup<BookIssue> {
}