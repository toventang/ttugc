package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.p2082ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.p2082ss.android.ugc.aweme.live.AbstractC58593c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareLiveContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3086b.C53713a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3079a.C53615d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55076b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55185ag;
import com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ak */
public final class View$OnAttachStateChangeListenerC54496ak implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    C19538ai f124881a;

    /* renamed from: b */
    ShareLiveContent f124882b;

    /* renamed from: c */
    boolean f124883c;

    /* renamed from: d */
    private final AbstractC89244h f124884d = C89250i.m154773a((AbstractC89171a) C54501e.f124909a);

    /* renamed from: e */
    private final View f124885e;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ak$d */
    public static final class C54500d<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C54500d f124908a = new C54500d();

        static {
            Covode.recordClassIndex(64211);
        }

        C54500d() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(64207);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C88411a mo91598a() {
        return (C88411a) this.f124884d.getValue();
    }

    public final void onViewAttachedToWindow(View view) {
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ak$e */
    static final class C54501e extends AbstractC89220m implements AbstractC89171a<C88411a> {

        /* renamed from: a */
        public static final C54501e f124909a = new C54501e();

        static {
            Covode.recordClassIndex(64212);
        }

        C54501e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C88411a invoke() {
            return new C88411a();
        }
    }

    /* renamed from: b */
    private final void m99884b() {
        String str;
        String str2;
        ShareLiveContent shareLiveContent = this.f124882b;
        String str3 = null;
        if (shareLiveContent != null) {
            str = shareLiveContent.getRoomOwnerId();
        } else {
            str = null;
        }
        ShareLiveContent shareLiveContent2 = this.f124882b;
        if (shareLiveContent2 != null) {
            str2 = shareLiveContent2.getRoomSecOwnerId();
        } else {
            str2 = null;
        }
        C55185ag.m100887a(str, str2);
        ShareLiveContent shareLiveContent3 = this.f124882b;
        if (shareLiveContent3 != null) {
            str3 = shareLiveContent3.getRoomOwnerId();
        }
        C53615d.m98863a(str3, "chat", "click_head");
    }

    public final void onViewDetachedFromWindow(View view) {
        mo91598a().mo142944a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ak$c */
    public static final class C54499c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f124900a;

        /* renamed from: b */
        final /* synthetic */ View$OnAttachStateChangeListenerC54496ak f124901b;

        /* renamed from: c */
        final /* synthetic */ AbstractC58593c f124902c;

        /* renamed from: d */
        final /* synthetic */ C89233z.C89237d f124903d;

        /* renamed from: e */
        final /* synthetic */ String f124904e;

        /* renamed from: f */
        final /* synthetic */ long f124905f;

        /* renamed from: g */
        final /* synthetic */ NewLiveRoomStruct f124906g;

        /* renamed from: h */
        final /* synthetic */ String f124907h;

        static {
            Covode.recordClassIndex(64210);
        }

        C54499c(C89233z.C89238e eVar, View$OnAttachStateChangeListenerC54496ak akVar, AbstractC58593c cVar, C89233z.C89237d dVar, String str, long j, NewLiveRoomStruct newLiveRoomStruct, String str2) {
            this.f124900a = eVar;
            this.f124901b = akVar;
            this.f124902c = cVar;
            this.f124903d = dVar;
            this.f124904e = str;
            this.f124905f = j;
            this.f124906g = newLiveRoomStruct;
            this.f124907h = str2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            boolean z;
            View$OnAttachStateChangeListenerC54496ak akVar = this.f124901b;
            NewLiveRoomStruct newLiveRoomStruct = this.f124906g;
            T t = this.f124900a.element;
            if (t != null && t.intValue() == 2) {
                z = true;
            } else {
                z = false;
            }
            akVar.mo91599a(newLiveRoomStruct, z, false);
        }
    }

    public View$OnAttachStateChangeListenerC54496ak(View view) {
        C89219l.m154721d(view, "");
        this.f124885e = view;
        view.addOnAttachStateChangeListener(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ak$a */
    public static final class C54497a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ View$OnAttachStateChangeListenerC54496ak f124886a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89237d f124887b;

        /* renamed from: c */
        final /* synthetic */ String f124888c;

        /* renamed from: d */
        final /* synthetic */ long f124889d;

        /* renamed from: e */
        final /* synthetic */ NewLiveRoomStruct f124890e;

        /* renamed from: f */
        final /* synthetic */ String f124891f;

        static {
            Covode.recordClassIndex(64208);
        }

        C54497a(View$OnAttachStateChangeListenerC54496ak akVar, C89233z.C89237d dVar, String str, long j, NewLiveRoomStruct newLiveRoomStruct, String str2) {
            this.f124886a = akVar;
            this.f124887b = dVar;
            this.f124888c = str;
            this.f124889d = j;
            this.f124890e = newLiveRoomStruct;
            this.f124891f = str2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            NewLiveRoomStruct newLiveRoomStruct = (NewLiveRoomStruct) obj;
            if (newLiveRoomStruct != null) {
                if (this.f124889d == newLiveRoomStruct.f114488id) {
                    return;
                }
            } else if ((newLiveRoomStruct == null && this.f124890e == null) || 1 == 0) {
                return;
            }
            AbstractC81915c.m141874a(new C53713a(this.f124891f, newLiveRoomStruct));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ak$b */
    public static final class C54498b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f124892a;

        /* renamed from: b */
        final /* synthetic */ View$OnAttachStateChangeListenerC54496ak f124893b;

        /* renamed from: c */
        final /* synthetic */ AbstractC58593c f124894c;

        /* renamed from: d */
        final /* synthetic */ C89233z.C89237d f124895d;

        /* renamed from: e */
        final /* synthetic */ String f124896e;

        /* renamed from: f */
        final /* synthetic */ long f124897f;

        /* renamed from: g */
        final /* synthetic */ NewLiveRoomStruct f124898g;

        /* renamed from: h */
        final /* synthetic */ String f124899h;

        static {
            Covode.recordClassIndex(64209);
        }

        C54498b(C89233z.C89238e eVar, View$OnAttachStateChangeListenerC54496ak akVar, AbstractC58593c cVar, C89233z.C89237d dVar, String str, long j, NewLiveRoomStruct newLiveRoomStruct, String str2) {
            this.f124892a = eVar;
            this.f124893b = akVar;
            this.f124894c = cVar;
            this.f124895d = dVar;
            this.f124896e = str;
            this.f124897f = j;
            this.f124898g = newLiveRoomStruct;
            this.f124899h = str2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
            if (1 != 0) goto L_0x003b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x003b, code lost:
            com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c.m141874a(new com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3086b.C53713a(r7.f124899h, r8));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
            if (r7.f124897f == r8.f114488id) goto L_0x000e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
            if (r8.f114488id != 0) goto L_0x001a;
         */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r8) {
            /*
                r7 = this;
                com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct r8 = (com.p2082ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct) r8
                r4 = 1
                r3 = 0
                if (r8 == 0) goto L_0x0031
                long r5 = r7.f124897f
                long r0 = r8.f114488id
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 != 0) goto L_0x003b
            L_0x000e:
                r5 = 0
                if (r8 == 0) goto L_0x0018
                long r1 = r8.f114488id
                int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r0 != 0) goto L_0x001a
            L_0x0018:
                com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct r8 = r7.f124898g
            L_0x001a:
                com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ak r2 = r7.f124893b
                h.f.b.z$e r0 = r7.f124892a
                T r0 = r0.element
                java.lang.Integer r0 = (java.lang.Integer) r0
                if (r0 != 0) goto L_0x0029
            L_0x0024:
                r4 = 0
            L_0x0025:
                r2.mo91599a(r8, r4, r3)
                return
            L_0x0029:
                int r1 = r0.intValue()
                r0 = 2
                if (r1 != r0) goto L_0x0024
                goto L_0x0025
            L_0x0031:
                r1 = 1
                if (r8 != 0) goto L_0x0039
                com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct r0 = r7.f124898g
                if (r0 != 0) goto L_0x0039
                goto L_0x0018
            L_0x0039:
                if (r1 == 0) goto L_0x000e
            L_0x003b:
                com.ss.android.ugc.aweme.im.sdk.chat.data.b.a r1 = new com.ss.android.ugc.aweme.im.sdk.chat.data.b.a
                java.lang.String r0 = r7.f124899h
                r1.<init>(r0, r8)
                com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c.m141874a(r1)
                goto L_0x000e
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.View$OnAttachStateChangeListenerC54496ak.C54498b.accept(java.lang.Object):void");
        }
    }

    /* renamed from: a */
    public final void mo91599a(NewLiveRoomStruct newLiveRoomStruct, boolean z, boolean z2) {
        this.f124883c = false;
        if (newLiveRoomStruct != null) {
            long j = newLiveRoomStruct.f114488id;
            if (j != 0) {
                m99883a(newLiveRoomStruct, j, z, z2);
                return;
            }
        }
        m99884b();
    }

    /* renamed from: a */
    private final void m99883a(NewLiveRoomStruct newLiveRoomStruct, long j, boolean z, boolean z2) {
        String str;
        String str2;
        Bundle bundle = new Bundle();
        C19538ai aiVar = this.f124881a;
        String str3 = null;
        if (aiVar != null) {
            bundle.putString("share_user_id", String.valueOf(Long.valueOf(aiVar.getSender())));
        }
        if (this.f124882b == null) {
            return;
        }
        if (!z) {
            AbstractC56220e b = C55076b.m100723b();
            Context context = this.f124885e.getContext();
            ShareLiveContent shareLiveContent = this.f124882b;
            if (shareLiveContent != null) {
                str2 = shareLiveContent.getRoomOwnerId();
            } else {
                str2 = null;
            }
            ShareLiveContent shareLiveContent2 = this.f124882b;
            if (shareLiveContent2 != null) {
                str3 = shareLiveContent2.getRoomSecOwnerId();
            }
            b.jumpToLivePage(context, str2, str3, String.valueOf(j), bundle);
            return;
        }
        AbstractC56220e b2 = C55076b.m100723b();
        Context context2 = this.f124885e.getContext();
        ShareLiveContent shareLiveContent3 = this.f124882b;
        if (shareLiveContent3 != null) {
            str = shareLiveContent3.getRoomOwnerId();
        } else {
            str = null;
        }
        ShareLiveContent shareLiveContent4 = this.f124882b;
        if (shareLiveContent4 != null) {
            str3 = shareLiveContent4.getRoomSecOwnerId();
        }
        b2.jumpToLivePage(context2, str, str3, newLiveRoomStruct, bundle, z2);
    }
}
