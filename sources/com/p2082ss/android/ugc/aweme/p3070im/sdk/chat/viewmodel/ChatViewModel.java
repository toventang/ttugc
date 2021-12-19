package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.viewmodel;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.C17438g;
import com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17426e;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.bytedance.p1399im.core.proto.MessageStatus;
import com.bytedance.p1399im.core.proto.ReferenceInfo;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ReferenceInfoHint;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.TextContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3087c.AbstractC53715a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3176g.C55126a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55214j;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3187a.p3188a.AbstractC55249a;
import java.util.Objects;
import java.util.concurrent.Callable;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88429b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatViewModel */
public final class ChatViewModel extends AbstractC1174ac {

    /* renamed from: i */
    public static final C54598a f125136i = new C54598a((byte) 0);

    /* renamed from: a */
    public int f125137a;

    /* renamed from: b */
    public int f125138b;

    /* renamed from: c */
    public C88411a f125139c;

    /* renamed from: d */
    public final C1213t<AbstractC55249a<Object>> f125140d;

    /* renamed from: e */
    public final C1213t<AbstractC55249a<C19538ai>> f125141e;

    /* renamed from: f */
    public final AbstractC53715a f125142f;

    /* renamed from: g */
    public final AbstractC88398aa f125143g;

    /* renamed from: h */
    public final AbstractC88398aa f125144h;

    static {
        Covode.recordClassIndex(64310);
    }

    public ChatViewModel() {
        this((byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatViewModel$a */
    public static final class C54598a {
        static {
            Covode.recordClassIndex(64311);
        }

        private C54598a() {
        }

        public /* synthetic */ C54598a(byte b) {
            this();
        }

        /* renamed from: a */
        public static ChatViewModel m100094a(Fragment fragment) {
            C89219l.m154721d(fragment, "");
            AbstractC1174ac a = C1181ae.m3879a(fragment, (C1175ad.AbstractC1177b) null).mo3983a(ChatViewModel.class);
            C89219l.m154716b(a, "");
            return (ChatViewModel) a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatViewModel$b */
    public static final class CallableC54599b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ ChatViewModel f125145a;

        /* renamed from: b */
        final /* synthetic */ String f125146b;

        /* renamed from: c */
        final /* synthetic */ long f125147c;

        static {
            Covode.recordClassIndex(64312);
        }

        public CallableC54599b(ChatViewModel chatViewModel, String str, long j) {
            this.f125145a = chatViewModel;
            this.f125146b = str;
            this.f125147c = j;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return this.f125145a.f125142f.mo90292a(this.f125146b, this.f125147c);
        }
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        super.onCleared();
        this.f125139c.mo142944a();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatViewModel$d */
    public static final class C54601d implements AbstractC17426e {

        /* renamed from: a */
        final /* synthetic */ ChatViewModel f125149a;

        static {
            Covode.recordClassIndex(64314);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54601d(ChatViewModel chatViewModel) {
            this.f125149a = chatViewModel;
        }

        @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17426e
        /* renamed from: a */
        public final void mo27800a(C19538ai aiVar) {
            this.f125149a.f125140d.setValue(new AbstractC55249a.C55254d(aiVar));
        }

        @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17426e
        /* renamed from: a */
        public final void mo27801a(C19538ai aiVar, C19672u uVar) {
            this.f125149a.f125138b = 3;
            this.f125149a.f125140d.setValue(new AbstractC55249a.C55250a(uVar));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatViewModel$e */
    public static final class C54602e implements AbstractC17426e {

        /* renamed from: a */
        final /* synthetic */ ChatViewModel f125150a;

        static {
            Covode.recordClassIndex(64315);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C54602e(ChatViewModel chatViewModel) {
            this.f125150a = chatViewModel;
        }

        @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17426e
        /* renamed from: a */
        public final void mo27800a(C19538ai aiVar) {
            this.f125150a.f125140d.setValue(new AbstractC55249a.C55254d(aiVar));
        }

        @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17426e
        /* renamed from: a */
        public final void mo27801a(C19538ai aiVar, C19672u uVar) {
            this.f125150a.f125140d.setValue(new AbstractC55249a.C55250a(uVar));
        }
    }

    /* renamed from: a */
    public final void mo91668a(C19538ai aiVar) {
        this.f125141e.setValue(new AbstractC55249a.C55254d(aiVar));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private /* synthetic */ ChatViewModel(byte r5) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.im.sdk.chat.data.c.b r3 = new com.ss.android.ugc.aweme.im.sdk.chat.data.c.b
            com.ss.android.ugc.aweme.im.sdk.chat.data.a.b r0 = new com.ss.android.ugc.aweme.im.sdk.chat.data.a.b
            r0.<init>()
            r3.<init>(r0)
            f.a.aa r0 = p4560f.p4561a.p4590k.C88946a.f201991c
            f.a.aa r2 = p4560f.p4561a.p4587h.C88925a.m154180b(r0)
            java.lang.String r1 = ""
            p4600h.p4611f.p4613b.C89219l.m154716b(r2, r1)
            f.a.aa r0 = p4560f.p4561a.p4562a.p4564b.C88392a.f200660a
            f.a.aa r0 = p4560f.p4561a.p4562a.p4563a.C88391a.m153580a(r0)
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r1)
            r4.<init>(r3, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.viewmodel.ChatViewModel.<init>(byte):void");
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatViewModel$c */
    public static final class C54600c<T1, T2> implements AbstractC88429b {

        /* renamed from: a */
        final /* synthetic */ ChatViewModel f125148a;

        static {
            Covode.recordClassIndex(64313);
        }

        public C54600c(ChatViewModel chatViewModel) {
            this.f125148a = chatViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88429b
        /* renamed from: a */
        public final /* synthetic */ void mo10350a(Object obj, Object obj2) {
            if (obj != null) {
                this.f125148a.f125141e.setValue(new AbstractC55249a.C55254d(obj));
            }
            if (obj2 != null) {
                this.f125148a.f125141e.setValue(new AbstractC55249a.AbstractC55251b.C55252a(obj2));
            }
        }
    }

    /* renamed from: a */
    public final void mo91669a(CharSequence charSequence, String str) {
        T t;
        int i;
        boolean z;
        this.f125137a = 100;
        if (!(charSequence == null || charSequence.length() == 0)) {
            String obj = charSequence.toString();
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
            if (C89361p.m154910b((CharSequence) obj).toString().length() != 0) {
                if (charSequence.length() > 6000) {
                    this.f125138b = 2;
                    this.f125140d.setValue(new AbstractC55249a.C55250a(Integer.valueOf(this.f125138b)));
                    return;
                }
                this.f125140d.setValue(new AbstractC55249a.C55253c(charSequence));
                long currentTimeMillis = System.currentTimeMillis();
                TextContent.Companion companion = TextContent.Companion;
                String obj2 = charSequence.toString();
                int length = obj2.length() - 1;
                int i2 = 0;
                boolean z2 = false;
                while (i2 <= length) {
                    if (!z2) {
                        i = i2;
                    } else {
                        i = length;
                    }
                    if (C89219l.m154703a(obj2.charAt(i), 32) <= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z2) {
                        if (!z) {
                            break;
                        }
                        length--;
                    } else if (!z) {
                        z2 = true;
                    } else {
                        i2++;
                    }
                }
                TextContent obtain = companion.obtain(obj2.subSequence(i2, length + 1).toString());
                obtain.setSendStartTime(Long.valueOf(currentTimeMillis));
                C55126a.m100847a(str, obtain);
                AbstractC55249a<C19538ai> value = this.f125141e.getValue();
                ReferenceInfo referenceInfo = null;
                if (!(value instanceof AbstractC55249a.C55254d)) {
                    value = null;
                }
                AbstractC55249a.C55254d dVar = (AbstractC55249a.C55254d) value;
                if (!(dVar == null || (t = dVar.f126348a) == null)) {
                    obtain.setType(703);
                    String content = t.getContent();
                    C89219l.m154716b(content, "");
                    String valueOf = String.valueOf(t.getSender());
                    String str2 = t.getSecSender().toString();
                    int msgType = t.getMsgType();
                    String content2 = t.getContent();
                    C89219l.m154716b(content2, "");
                    referenceInfo = new ReferenceInfo.Builder().hint(C55214j.m100958a(new ReferenceInfoHint(content, valueOf, str2, msgType, content2))).referenced_message_id(Long.valueOf(t.getMsgId())).ref_message_type(0L).referenced_message_status(MessageStatus.AVAILABLE).build();
                }
                C17438g.C17439a.m32347a().mo27820b(str).mo27813a(obtain).mo27814a(referenceInfo).mo27819a(new C54601d(this));
                return;
            }
        }
        this.f125138b = 1;
        this.f125140d.setValue(new AbstractC55249a.C55250a(Integer.valueOf(this.f125138b)));
    }

    private ChatViewModel(AbstractC53715a aVar, AbstractC88398aa aaVar, AbstractC88398aa aaVar2) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aaVar, "");
        C89219l.m154721d(aaVar2, "");
        this.f125142f = aVar;
        this.f125143g = aaVar;
        this.f125144h = aaVar2;
        this.f125137a = 100;
        this.f125138b = 1;
        this.f125139c = new C88411a();
        this.f125140d = new C1213t<>();
        this.f125141e = new C1213t<>();
    }
}
