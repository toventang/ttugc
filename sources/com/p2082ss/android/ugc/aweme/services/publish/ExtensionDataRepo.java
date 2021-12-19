package com.p2082ss.android.ugc.aweme.services.publish;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39053a;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo */
public final class ExtensionDataRepo extends AbstractC1174ac {
    private AbstractC89171a<C89391z> addStarAtlasTag = ExtensionDataRepo$addStarAtlasTag$1.INSTANCE;
    private final C1213t<Boolean> anchorExtension;
    private final C1213t<Boolean> anchorState;
    private final C1213t<Boolean> couponExtension;
    private final C1213t<Boolean> gameExtension;
    private final C1213t<Boolean> goodsExtension;
    private final C1213t<Boolean> goodsState;
    private final C1213t<Boolean> i18nPrivacy;
    private final C1213t<Boolean> i18nShopExtension;
    private final C1213t<Boolean> i18nStarAtlasClosed;
    private IPermissionAction iPermissionAction;
    private final C1213t<Boolean> isGoodsAdd;
    private final C1213t<Boolean> mediumExtension;
    private final C1213t<Boolean> microAppExtension;
    private final C1213t<Boolean> movieExtension;
    private final C1213t<Boolean> postExtension;
    private AbstractC89171a<C89391z> removeStarAtlasTag = ExtensionDataRepo$removeStarAtlasTag$1.INSTANCE;
    private AbstractC89171a<C89391z> resetAnchor = ExtensionDataRepo$resetAnchor$1.INSTANCE;
    private AbstractC89171a<C89391z> resetGoodsAction = ExtensionDataRepo$resetGoodsAction$1.INSTANCE;
    private AbstractC89172b<? super String, C89391z> restoreGoodsPublishModel = ExtensionDataRepo$restoreGoodsPublishModel$1.INSTANCE;
    private final C1213t<Boolean> seedingExtension;
    private AbstractC89172b<? super Integer, Boolean> showPermissionAction;
    private final C1213t<Boolean> starAtlasState;
    private C1213t<C39053a> updateAnchor = new C1213t<>();
    private C1213t<List<C39053a>> updateAnchors = new C1213t<>();
    private final C1213t<Boolean> wikiExtension;
    private C1213t<String> zipUrl = new C1213t<>();

    static {
        Covode.recordClassIndex(79925);
    }

    public final AbstractC89171a<C89391z> getAddStarAtlasTag() {
        return this.addStarAtlasTag;
    }

    public final C1213t<Boolean> getAnchorExtension() {
        return this.anchorExtension;
    }

    public final C1213t<Boolean> getAnchorState() {
        return this.anchorState;
    }

    public final C1213t<Boolean> getCouponExtension() {
        return this.couponExtension;
    }

    public final C1213t<Boolean> getGameExtension() {
        return this.gameExtension;
    }

    public final C1213t<Boolean> getGoodsExtension() {
        return this.goodsExtension;
    }

    public final C1213t<Boolean> getGoodsState() {
        return this.goodsState;
    }

    public final C1213t<Boolean> getI18nPrivacy() {
        return this.i18nPrivacy;
    }

    public final C1213t<Boolean> getI18nShopExtension() {
        return this.i18nShopExtension;
    }

    public final C1213t<Boolean> getI18nStarAtlasClosed() {
        return this.i18nStarAtlasClosed;
    }

    public final IPermissionAction getIPermissionAction() {
        return this.iPermissionAction;
    }

    public final C1213t<Boolean> getMediumExtension() {
        return this.mediumExtension;
    }

    public final C1213t<Boolean> getMicroAppExtension() {
        return this.microAppExtension;
    }

    public final C1213t<Boolean> getMovieExtension() {
        return this.movieExtension;
    }

    public final C1213t<Boolean> getPostExtension() {
        return this.postExtension;
    }

    public final AbstractC89171a<C89391z> getRemoveStarAtlasTag() {
        return this.removeStarAtlasTag;
    }

    public final AbstractC89171a<C89391z> getResetAnchor() {
        return this.resetAnchor;
    }

    public final AbstractC89171a<C89391z> getResetGoodsAction() {
        return this.resetGoodsAction;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.lang.String, h.z>, h.f.a.b<java.lang.String, h.z> */
    public final AbstractC89172b<String, C89391z> getRestoreGoodsPublishModel() {
        return this.restoreGoodsPublishModel;
    }

    public final C1213t<Boolean> getSeedingExtension() {
        return this.seedingExtension;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.lang.Integer, java.lang.Boolean>, h.f.a.b<java.lang.Integer, java.lang.Boolean> */
    public final AbstractC89172b<Integer, Boolean> getShowPermissionAction() {
        return this.showPermissionAction;
    }

    public final C1213t<Boolean> getStarAtlasState() {
        return this.starAtlasState;
    }

    public final C1213t<C39053a> getUpdateAnchor() {
        return this.updateAnchor;
    }

    public final C1213t<List<C39053a>> getUpdateAnchors() {
        return this.updateAnchors;
    }

    public final C1213t<Boolean> getWikiExtension() {
        return this.wikiExtension;
    }

    public final C1213t<String> getZipUrl() {
        return this.zipUrl;
    }

    public final C1213t<Boolean> isGoodsAdd() {
        return this.isGoodsAdd;
    }

    public ExtensionDataRepo() {
        C1213t<Boolean> tVar = new C1213t<>();
        tVar.setValue(false);
        this.isGoodsAdd = tVar;
        C1213t<Boolean> tVar2 = new C1213t<>();
        tVar2.setValue(true);
        this.i18nPrivacy = tVar2;
        C1213t<Boolean> tVar3 = new C1213t<>();
        tVar3.setValue(true);
        this.i18nStarAtlasClosed = tVar3;
        C1213t<Boolean> tVar4 = new C1213t<>();
        tVar4.setValue(true);
        this.starAtlasState = tVar4;
        C1213t<Boolean> tVar5 = new C1213t<>();
        tVar5.setValue(true);
        this.goodsState = tVar5;
        C1213t<Boolean> tVar6 = new C1213t<>();
        tVar6.setValue(true);
        this.anchorState = tVar6;
        C1213t<Boolean> tVar7 = new C1213t<>();
        tVar7.setValue(false);
        this.movieExtension = tVar7;
        C1213t<Boolean> tVar8 = new C1213t<>();
        tVar8.setValue(false);
        this.postExtension = tVar8;
        C1213t<Boolean> tVar9 = new C1213t<>();
        tVar9.setValue(false);
        this.seedingExtension = tVar9;
        C1213t<Boolean> tVar10 = new C1213t<>();
        tVar10.setValue(false);
        this.goodsExtension = tVar10;
        C1213t<Boolean> tVar11 = new C1213t<>();
        tVar11.setValue(false);
        this.i18nShopExtension = tVar11;
        C1213t<Boolean> tVar12 = new C1213t<>();
        tVar12.setValue(false);
        this.wikiExtension = tVar12;
        C1213t<Boolean> tVar13 = new C1213t<>();
        tVar13.setValue(false);
        this.gameExtension = tVar13;
        C1213t<Boolean> tVar14 = new C1213t<>();
        tVar14.setValue(false);
        this.anchorExtension = tVar14;
        C1213t<Boolean> tVar15 = new C1213t<>();
        tVar15.setValue(false);
        this.couponExtension = tVar15;
        C1213t<Boolean> tVar16 = new C1213t<>();
        tVar16.setValue(false);
        this.mediumExtension = tVar16;
        C1213t<Boolean> tVar17 = new C1213t<>();
        tVar17.setValue(false);
        this.microAppExtension = tVar17;
    }

    public final void setIPermissionAction(IPermissionAction iPermissionAction2) {
        this.iPermissionAction = iPermissionAction2;
    }

    public final void setShowPermissionAction(AbstractC89172b<? super Integer, Boolean> bVar) {
        this.showPermissionAction = bVar;
    }

    public final void setAddStarAtlasTag(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        this.addStarAtlasTag = aVar;
    }

    public final void setRemoveStarAtlasTag(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        this.removeStarAtlasTag = aVar;
    }

    public final void setResetAnchor(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        this.resetAnchor = aVar;
    }

    public final void setResetGoodsAction(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        this.resetGoodsAction = aVar;
    }

    public final void setRestoreGoodsPublishModel(AbstractC89172b<? super String, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.restoreGoodsPublishModel = bVar;
    }

    public final void setUpdateAnchor(C1213t<C39053a> tVar) {
        C89219l.m154721d(tVar, "");
        this.updateAnchor = tVar;
    }

    public final void setUpdateAnchors(C1213t<List<C39053a>> tVar) {
        C89219l.m154721d(tVar, "");
        this.updateAnchors = tVar;
    }

    public final void setZipUrl(C1213t<String> tVar) {
        C89219l.m154721d(tVar, "");
        this.zipUrl = tVar;
    }
}
