package com.p2082ss.android.ugc.aweme.comment.util;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.IExternalService;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.CommentVideoConfig;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.QaStructConfig;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.RecordConfig;
import com.p2082ss.android.ugc.aweme.setting.C68435t;
import com.p2082ss.android.ugc.aweme.setting.C68719x;
import com.p2082ss.android.ugc.aweme.setting.EoyHighlightConfig;
import com.p2082ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.p2082ss.android.ugc.aweme.sticker.data.QaStruct;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.util.u */
public final class C37218u {

    /* renamed from: a */
    public static final C37218u f87750a = new C37218u();

    /* renamed from: com.ss.android.ugc.aweme.comment.util.u$a */
    public static final class C37219a implements IExternalService.ServiceLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Context f87751a;

        /* renamed from: b */
        final /* synthetic */ RecordConfig.Builder f87752b;

        static {
            Covode.recordClassIndex(44574);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onDismiss() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onFailed() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onOK() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
        }

        C37219a(Context context, RecordConfig.Builder builder) {
            this.f87751a = context;
            this.f87752b = builder;
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j) {
            C89219l.m154721d(asyncAVService, "");
            asyncAVService.uiService().recordService().startRecord(this.f87751a, this.f87752b.build());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.util.u$b */
    public static final class C37220b implements IExternalService.ServiceLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Context f87753a;

        /* renamed from: b */
        final /* synthetic */ RecordConfig.Builder f87754b;

        static {
            Covode.recordClassIndex(44575);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onDismiss() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onFailed() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onOK() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
        }

        C37220b(Context context, RecordConfig.Builder builder) {
            this.f87753a = context;
            this.f87754b = builder;
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j) {
            C89219l.m154721d(asyncAVService, "");
            asyncAVService.uiService().recordService().startRecord(this.f87753a, this.f87754b.build());
        }
    }

    private C37218u() {
    }

    static {
        Covode.recordClassIndex(44573);
    }

    /* renamed from: a */
    private static RecordConfig.Builder m75211a(RecordConfig.Builder builder, String str) {
        String str2;
        EoyHighlightConfig eoyHighlightConfig = C68719x.f153729b;
        if (eoyHighlightConfig != null) {
            str2 = eoyHighlightConfig.getEffectId();
        } else {
            str2 = null;
        }
        if (C68435t.m120865a(str) && str2 != null) {
            builder.autoUseSticker(str2).showPreloadingDialog(true).showCancelAfterPinProp(true).recordPresetResource(new RecordPresetResource(str2, null, null, null, 14, null));
        }
        return builder;
    }

    /* renamed from: a */
    public static final void m75212a(Context context, CommentVideoModel commentVideoModel) {
        String str;
        String shootWay;
        String str2 = "";
        C89219l.m154721d(context, str2);
        RecordConfig.Builder builder = new RecordConfig.Builder();
        if (commentVideoModel == null || (str = commentVideoModel.getShootWay()) == null) {
            str = str2;
        }
        RecordConfig.Builder shootWay2 = builder.shootWay(str);
        CommentVideoConfig commentVideoConfig = new CommentVideoConfig();
        commentVideoConfig.setCommentVideoModel(commentVideoModel);
        RecordConfig.Builder CommentVideoConfig = shootWay2.CommentVideoConfig(commentVideoConfig);
        IExternalService a = AVExternalServiceImpl.m113114a();
        if (!(commentVideoModel == null || (shootWay = commentVideoModel.getShootWay()) == null)) {
            str2 = shootWay;
        }
        a.asyncService(context, str2, new C37219a(context, CommentVideoConfig));
    }

    /* renamed from: a */
    public static final void m75213a(Context context, QaStruct qaStruct, String str, String str2, String str3) {
        String str4;
        C89219l.m154721d(context, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        RecordConfig.Builder enterMethod = new RecordConfig.Builder().shootWay(str3).enterFrom(str).enterMethod(str2);
        QaStructConfig qaStructConfig = new QaStructConfig();
        qaStructConfig.setQaStruct(qaStruct);
        RecordConfig.Builder qaVideoConfig = enterMethod.qaVideoConfig(qaStructConfig);
        if (qaStruct != null) {
            str4 = qaStruct.getQuestionContent();
        } else {
            str4 = null;
        }
        AVExternalServiceImpl.m113114a().asyncService(context, str3, new C37220b(context, m75211a(qaVideoConfig, str4)));
    }
}
