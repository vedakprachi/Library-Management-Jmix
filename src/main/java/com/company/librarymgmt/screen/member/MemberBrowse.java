package com.company.librarymgmt.screen.member;

import io.jmix.ui.screen.*;
import com.company.librarymgmt.entity.Member;

@UiController("Member_.browse")
@UiDescriptor("member-browse.xml")
@LookupComponent("membersTable")
public class MemberBrowse extends StandardLookup<Member> {
}