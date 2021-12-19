package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.epoxy;

import com.airbnb.epoxy.AbstractC1935f;
import com.airbnb.epoxy.AbstractC1956s;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b.C54711g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b.C54714i;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b.C54717k;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b.C54728p;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b.C54731r;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b.C54734t;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b.C54738v;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.epoxy.GroupChatController_EpoxyHelper */
public class GroupChatController_EpoxyHelper extends AbstractC1935f<GroupChatController> {
    private AbstractC1956s addMemberModel;
    private AbstractC1956s approveModel;
    private final GroupChatController controller;
    private AbstractC1956s dividerOne;
    private AbstractC1956s dividerThree;
    private AbstractC1956s dividerTwo;
    private AbstractC1956s endGroupModel;
    private AbstractC1956s groupMemberHeader;
    private AbstractC1956s groupMemberSeeMore;
    private AbstractC1956s groupTitleModel;
    private AbstractC1956s inviteModel;
    private AbstractC1956s leaveGroupModel;
    private AbstractC1956s muteModel;
    private AbstractC1956s pinModel;
    private AbstractC1956s reportModel;
    private AbstractC1956s reportSensitiveModel;
    private AbstractC1956s requestSeeMore;

    static {
        Covode.recordClassIndex(64475);
    }

    private void saveModelsForNextValidation() {
        this.groupTitleModel = this.controller.groupTitleModel;
        this.groupMemberHeader = this.controller.groupMemberHeader;
        this.reportSensitiveModel = this.controller.reportSensitiveModel;
        this.dividerTwo = this.controller.dividerTwo;
        this.dividerOne = this.controller.dividerOne;
        this.leaveGroupModel = this.controller.leaveGroupModel;
        this.inviteModel = this.controller.inviteModel;
        this.groupMemberSeeMore = this.controller.groupMemberSeeMore;
        this.reportModel = this.controller.reportModel;
        this.requestSeeMore = this.controller.requestSeeMore;
        this.addMemberModel = this.controller.addMemberModel;
        this.muteModel = this.controller.muteModel;
        this.pinModel = this.controller.pinModel;
        this.endGroupModel = this.controller.endGroupModel;
        this.approveModel = this.controller.approveModel;
        this.dividerThree = this.controller.dividerThree;
    }

    private void validateModelsHaveNotChanged() {
        validateSameModel(this.groupTitleModel, this.controller.groupTitleModel, "groupTitleModel", -1);
        validateSameModel(this.groupMemberHeader, this.controller.groupMemberHeader, "groupMemberHeader", -2);
        validateSameModel(this.reportSensitiveModel, this.controller.reportSensitiveModel, "reportSensitiveModel", -3);
        validateSameModel(this.dividerTwo, this.controller.dividerTwo, "dividerTwo", -4);
        validateSameModel(this.dividerOne, this.controller.dividerOne, "dividerOne", -5);
        validateSameModel(this.leaveGroupModel, this.controller.leaveGroupModel, "leaveGroupModel", -6);
        validateSameModel(this.inviteModel, this.controller.inviteModel, "inviteModel", -7);
        validateSameModel(this.groupMemberSeeMore, this.controller.groupMemberSeeMore, "groupMemberSeeMore", -8);
        validateSameModel(this.reportModel, this.controller.reportModel, "reportModel", -9);
        validateSameModel(this.requestSeeMore, this.controller.requestSeeMore, "requestSeeMore", -10);
        validateSameModel(this.addMemberModel, this.controller.addMemberModel, "addMemberModel", -11);
        validateSameModel(this.muteModel, this.controller.muteModel, "muteModel", -12);
        validateSameModel(this.pinModel, this.controller.pinModel, "pinModel", -13);
        validateSameModel(this.endGroupModel, this.controller.endGroupModel, "endGroupModel", -14);
        validateSameModel(this.approveModel, this.controller.approveModel, "approveModel", -15);
        validateSameModel(this.dividerThree, this.controller.dividerThree, "dividerThree", -16);
        validateModelHashCodesHaveNotChanged(this.controller);
    }

    @Override // com.airbnb.epoxy.AbstractC1935f
    public void resetAutoModels() {
        validateModelsHaveNotChanged();
        this.controller.groupTitleModel = new C54711g();
        this.controller.groupTitleModel.mo91742i();
        setControllerToStageTo(this.controller.groupTitleModel, this.controller);
        this.controller.groupMemberHeader = new C54714i();
        this.controller.groupMemberHeader.mo91744b(-2L);
        setControllerToStageTo(this.controller.groupMemberHeader, this.controller);
        this.controller.reportSensitiveModel = new C54731r();
        this.controller.reportSensitiveModel.mo91772b(-3L);
        setControllerToStageTo(this.controller.reportSensitiveModel, this.controller);
        this.controller.dividerTwo = new C54734t();
        this.controller.dividerTwo.mo91777b(-4L);
        setControllerToStageTo(this.controller.dividerTwo, this.controller);
        this.controller.dividerOne = new C54734t();
        this.controller.dividerOne.mo91777b(-5L);
        setControllerToStageTo(this.controller.dividerOne, this.controller);
        this.controller.leaveGroupModel = new C54731r();
        this.controller.leaveGroupModel.mo91772b(-6L);
        setControllerToStageTo(this.controller.leaveGroupModel, this.controller);
        this.controller.inviteModel = new C54717k();
        this.controller.inviteModel.mo91747b(-7L);
        setControllerToStageTo(this.controller.inviteModel, this.controller);
        this.controller.groupMemberSeeMore = new C54728p();
        this.controller.groupMemberSeeMore.mo91768b(-8L);
        setControllerToStageTo(this.controller.groupMemberSeeMore, this.controller);
        this.controller.reportModel = new C54717k();
        this.controller.reportModel.mo91747b(-9L);
        setControllerToStageTo(this.controller.reportModel, this.controller);
        this.controller.requestSeeMore = new C54728p();
        this.controller.requestSeeMore.mo91768b(-10L);
        setControllerToStageTo(this.controller.requestSeeMore, this.controller);
        this.controller.addMemberModel = new C54734t();
        this.controller.addMemberModel.mo91777b(-11L);
        setControllerToStageTo(this.controller.addMemberModel, this.controller);
        this.controller.muteModel = new C54738v();
        this.controller.muteModel.mo91782b(-12L);
        setControllerToStageTo(this.controller.muteModel, this.controller);
        this.controller.pinModel = new C54738v();
        this.controller.pinModel.mo91782b(-13L);
        setControllerToStageTo(this.controller.pinModel, this.controller);
        this.controller.endGroupModel = new C54731r();
        this.controller.endGroupModel.mo91772b(-14L);
        setControllerToStageTo(this.controller.endGroupModel, this.controller);
        this.controller.approveModel = new C54738v();
        this.controller.approveModel.mo91782b(-15L);
        setControllerToStageTo(this.controller.approveModel, this.controller);
        this.controller.dividerThree = new C54734t();
        this.controller.dividerThree.mo91777b(-16L);
        setControllerToStageTo(this.controller.dividerThree, this.controller);
        saveModelsForNextValidation();
    }

    public GroupChatController_EpoxyHelper(GroupChatController groupChatController) {
        this.controller = groupChatController;
    }

    private void validateSameModel(AbstractC1956s sVar, AbstractC1956s sVar2, String str, int i) {
        if (sVar != sVar2) {
            throw new IllegalStateException("Fields annotated with AutoModel cannot be directly assigned. The controller manages these fields for you. (" + this.controller.getClass().getSimpleName() + "#" + str + ")");
        } else if (sVar2 != null && sVar2.f5838a != ((long) i)) {
            throw new IllegalStateException("Fields annotated with AutoModel cannot have their id changed manually. The controller manages the ids of these models for you. (" + this.controller.getClass().getSimpleName() + "#" + str + ")");
        }
    }
}
