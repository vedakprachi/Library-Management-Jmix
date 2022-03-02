package com.company.librarymgmt.screen.member;

import io.jmix.ui.screen.*;
import com.company.librarymgmt.entity.Member;

@UiController("Member_.edit")
@UiDescriptor("member-edit.xml")
@EditedEntityContainer("memberDc")
public class MemberEdit extends StandardEditor<Member> {
}