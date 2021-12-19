package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.read.data.manager;

import android.os.Message;
import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.read.data.C54266a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.read.viewmodel.AbsReadStateDelegate;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.read.viewmodel.C54278a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.read.viewmodel.ReadStateViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89064i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.read.data.manager.ReadStateSyncDelegate */
public final class ReadStateSyncDelegate extends AbsReadStateDelegate {

    /* renamed from: a */
    public static final Integer[] f124315a = {1, 1001, 1002, 1005, 1010};

    /* renamed from: b */
    public static final C54270a f124316b = new C54270a((byte) 0);

    /* renamed from: d */
    private boolean f124317d;

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.read.viewmodel.AbsReadStateDelegate, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3134b.AbstractC54406a
    public final void onStop() {
        this.f124317d = false;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.read.data.manager.ReadStateSyncDelegate$a */
    public static final class C54270a {
        static {
            Covode.recordClassIndex(63962);
        }

        private C54270a() {
        }

        public /* synthetic */ C54270a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.read.viewmodel.AbsReadStateDelegate, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3134b.AbstractC54406a
    public final void onResume() {
        this.f124317d = true;
        m99529a(true);
    }

    /* renamed from: d */
    private final void m99532d() {
        C54266a value = this.f124326c.mo91369c().getValue();
        if (value != null && value.mo91347b()) {
            sendEmptyMessageDelayed(1, 200);
        }
    }

    /* renamed from: c */
    public final void mo91355c() {
        C54266a value = this.f124326c.mo91369c().getValue();
        if (value != null && value.mo91347b()) {
            sendEmptyMessageDelayed(0, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
        }
    }

    static {
        Covode.recordClassIndex(63961);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.read.viewmodel.AbsReadStateDelegate
    /* renamed from: a */
    public final void mo91349a() {
        if (this.f124326c.f124337b.isGroupChat()) {
            m99532d();
            return;
        }
        this.f124326c.mo91367a((C19538ai) null);
        C54272a a = this.f124326c.mo91365a();
        if (a != null) {
            a.mo91357a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.read.viewmodel.AbsReadStateDelegate
    public final void bG_() {
        Object obj;
        C54272a a;
        if (!this.f124326c.mo91368b().isEmpty()) {
            if (!this.f124326c.f124337b.isGroupChat() && (a = this.f124326c.mo91365a()) != null) {
                boolean z = !this.f124326c.mo91368b().get(0).isSelf();
                if (!a.f124323c && z) {
                    a.mo91358a("replied");
                }
                a.f124323c = true;
            }
            List<C19538ai> b = this.f124326c.mo91368b();
            ArrayList arrayList = new ArrayList();
            for (T t : b) {
                T t2 = t;
                if (t2 != null && !C89064i.m154489a(f124315a, Integer.valueOf(t2.getMsgType()))) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = arrayList;
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                C19538ai aiVar = (C19538ai) obj;
                if (aiVar.isSelf() && !aiVar.isDeleted()) {
                    break;
                }
            }
            C19538ai aiVar2 = (C19538ai) obj;
            if (aiVar2 != null) {
                C54278a aVar = this.f124326c;
                if (aVar.f124337b.isGroupChat() || arrayList2.indexOf(aiVar2) == 0) {
                    aiVar2.getMsgId();
                    ((C19538ai) C89070n.m154579f((List) this.f124326c.mo91368b())).getMsgId();
                    if (m99530a(aiVar2) && this.f124326c.mo91367a(aiVar2)) {
                        m99532d();
                        mo91355c();
                    }
                } else if (aVar.mo91369c().getValue() != null) {
                    aVar.mo91367a((C19538ai) null);
                    C54272a a2 = this.f124326c.mo91365a();
                    if (a2 != null) {
                        a2.mo91357a();
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.read.data.manager.ReadStateSyncDelegate$b */
    public final class C54271b implements AbstractC19479b<Pair<List<? extends Long>, List<? extends Long>>> {

        /* renamed from: a */
        public final C19538ai f124318a;

        /* renamed from: b */
        final /* synthetic */ ReadStateSyncDelegate f124319b;

        static {
            Covode.recordClassIndex(63963);
        }

        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final void mo27860a(C19672u uVar) {
            if (uVar != null) {
                Integer.valueOf(uVar.f46728a);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final /* synthetic */ void mo27861a(Pair<List<? extends Long>, List<? extends Long>> pair) {
            Pair<List<? extends Long>, List<? extends Long>> pair2 = pair;
            this.f124319b.f124326c.mo91369c().getValue();
            this.f124318a.getMsgId();
            this.f124319b.mo91355c();
            if (pair2 != null) {
                Collection collection = (Collection) pair2.second;
                int i = 0;
                if (collection != null && !collection.isEmpty()) {
                    C54278a aVar = this.f124319b.f124326c;
                    C19538ai aiVar = this.f124318a;
                    C54266a value = aVar.mo91369c().getValue();
                    if (value != null && C89219l.m154714a(aiVar, value.f124308b)) {
                        Collection collection2 = (Collection) pair2.first;
                        if (collection2 == null || collection2.isEmpty()) {
                            C54278a aVar2 = this.f124319b.f124326c;
                            if (!ReadStateSyncDelegate.m99530a(this.f124318a)) {
                                i = -1;
                            }
                            aVar2.mo91366a(i);
                            return;
                        }
                        List list = (List) pair2.first;
                        if (list != null) {
                            int size = list.size();
                            Object obj = pair2.second;
                            if (obj == null) {
                                C89219l.m154715b();
                            }
                            if (size == ((List) obj).size()) {
                                this.f124319b.f124326c.mo91366a(2);
                            }
                        }
                    }
                }
            }
        }

        public C54271b(ReadStateSyncDelegate readStateSyncDelegate, C19538ai aiVar) {
            C89219l.m154721d(aiVar, "");
            this.f124319b = readStateSyncDelegate;
            this.f124318a = aiVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReadStateSyncDelegate(C54278a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
    }

    /* renamed from: a */
    public static boolean m99530a(C19538ai aiVar) {
        if ((aiVar.getMsgId() <= 0 || aiVar.getMsgStatus() != 2) && aiVar.getMsgStatus() != 5) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m99531b(C19538ai aiVar) {
        return C89219l.m154714a((Object) "1", (Object) aiVar.getExt().get("visible_code"));
    }

    public final void handleMessage(Message message) {
        C89219l.m154721d(message, "");
        int i = message.what;
        if (i == 0) {
            removeMessages(0);
            m99529a(true);
        } else if (i == 1) {
            removeMessages(1);
            m99529a(false);
        }
    }

    /* renamed from: a */
    private final void m99529a(boolean z) {
        C54266a value;
        if (ReadStateViewModel.f124327b && this.f124326c.f124337b.getSelectMsgType() != 1 && this.f124326c.mo91370d() != null) {
            C19638h d = this.f124326c.mo91370d();
            if (d == null) {
                C89219l.m154715b();
            }
            if (!d.isMember() || (value = this.f124326c.mo91369c().getValue()) == null || !this.f124317d || !value.mo91347b()) {
                return;
            }
            if (m99531b(value.f124308b)) {
                this.f124326c.mo91366a(3);
            } else {
                this.f124326c.f124336a.mo27760a(value.f124308b, z, new C54271b(this, value.f124308b));
            }
        }
    }
}
