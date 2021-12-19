package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.single.p3125ui;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.single.p3124a.C54315a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3079a.C53615d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.C53687f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.AbstractC54431c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3135c.C54434a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.helper.C54881c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3170a.C55052e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55085g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3259i.AbstractC56230a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui.SingleChatTitleBarComponent */
public final class SingleChatTitleBarComponent implements AbstractC33974au, AbstractC54431c {

    /* renamed from: a */
    public final C54315a f124426a;

    /* renamed from: b */
    public final C54434a f124427b;

    /* renamed from: c */
    public final ImTextTitleBar f124428c;

    static {
        Covode.recordClassIndex(64018);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_CREATE) {
            onCreate();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui.SingleChatTitleBarComponent$b */
    public static final class C54321b implements ImTextTitleBar.AbstractC55309a {

        /* renamed from: a */
        final /* synthetic */ SingleChatTitleBarComponent f124430a;

        static {
            Covode.recordClassIndex(64020);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
        /* renamed from: b */
        public final void mo91164b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
        /* renamed from: a */
        public final void mo91162a() {
            this.f124430a.f124427b.mo64296c();
            this.f124430a.f124427b.requireActivity().finish();
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
        /* renamed from: c */
        public final void mo91165c() {
            String singleChatFromUserId = this.f124430a.f124426a.getSingleChatFromUserId();
            C54881c.m100491a(singleChatFromUserId);
            C53615d.m98863a(singleChatFromUserId, "chat", "click_name");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54321b(SingleChatTitleBarComponent singleChatTitleBarComponent) {
            this.f124430a = singleChatTitleBarComponent;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index: 0
            	at java.base/java.util.Collections$EmptyList.get(Collections.java:4586)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
        /* renamed from: a */
        public final void mo91163a(int r9) {
            /*
            // Method dump skipped, instructions count: 182
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.single.p3125ui.SingleChatTitleBarComponent.C54321b.mo91163a(int):void");
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    public final void onCreate() {
        String str;
        ImTextTitleBar imTextTitleBar = this.f124428c;
        IMUser fromUser = this.f124426a.getFromUser();
        if (fromUser != null) {
            str = fromUser.getDisplayName();
        } else {
            str = null;
        }
        imTextTitleBar.setTitle(str);
        if (C55052e.m100671b()) {
            this.f124428c.setRightIcons(R.raw.icon_flag, R.raw.icon_ellipsis_horizontal);
        }
        this.f124428c.setOnTitlebarClickListener(new C54321b(this));
        IMUser fromUser2 = this.f124426a.getFromUser();
        if (fromUser2 != null && !IMUser.isInvalidUser(fromUser2.getUid())) {
            C55085g.m100761b(fromUser2.getUid(), fromUser2.getSecUid(), new C54320a(this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui.SingleChatTitleBarComponent$a */
    public static final class C54320a implements AbstractC56230a {

        /* renamed from: a */
        final /* synthetic */ SingleChatTitleBarComponent f124429a;

        static {
            Covode.recordClassIndex(64019);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54320a(SingleChatTitleBarComponent singleChatTitleBarComponent) {
            this.f124429a = singleChatTitleBarComponent;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3259i.AbstractC56230a
        /* renamed from: a */
        public final void mo91086a(Throwable th) {
            C89219l.m154721d(th, "");
            C89219l.m154721d(th, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3259i.AbstractC56230a
        /* renamed from: a */
        public final void mo91085a(IMUser iMUser) {
            String displayName;
            if (iMUser != null) {
                this.f124429a.f124426a.setFromUser(iMUser);
                IMUser fromUser = this.f124429a.f124426a.getFromUser();
                if (!(fromUser == null || (displayName = fromUser.getDisplayName()) == null)) {
                    this.f124429a.f124428c.setTitle(displayName);
                }
                C53687f.m98955a(this.f124429a.f124426a.getFromUser(), this.f124429a.f124426a.getConversationId(), Integer.valueOf(this.f124429a.f124426a.getEnterFrom()), "SingleChatPanel");
            }
        }
    }

    public SingleChatTitleBarComponent(C54315a aVar, C54434a aVar2, ImTextTitleBar imTextTitleBar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(imTextTitleBar, "");
        this.f124426a = aVar;
        this.f124427b = aVar2;
        this.f124428c = imTextTitleBar;
    }
}
