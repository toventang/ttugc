package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.viewmodel;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1169aa;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import androidx.p012a.p013a.p016c.AbstractC0189a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19639i;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.data.C54004b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3139a.C54603a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a.p3199a.C55339a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3200b.p3201a.C55361a;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.viewmodel.GroupChatViewModel */
public final class GroupChatViewModel extends AbstractC1174ac {

    /* renamed from: g */
    public static final C54077a f123930g = new C54077a((byte) 0);

    /* renamed from: a */
    public final C1213t<Integer> f123931a;

    /* renamed from: b */
    public final C1213t<C19638h> f123932b;

    /* renamed from: c */
    public final LiveData<Boolean> f123933c;

    /* renamed from: d */
    public final C1213t<Boolean> f123934d;

    /* renamed from: e */
    public final C54004b f123935e;

    /* renamed from: f */
    public final AbstractC17420a f123936f;

    /* renamed from: h */
    private final AbstractC89244h f123937h;

    static {
        Covode.recordClassIndex(63753);
    }

    /* renamed from: a */
    public final C19638h mo91175a() {
        return (C19638h) this.f123937h.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.viewmodel.GroupChatViewModel$a */
    public static final class C54077a {
        static {
            Covode.recordClassIndex(63754);
        }

        private C54077a() {
        }

        public /* synthetic */ C54077a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.viewmodel.GroupChatViewModel$b */
    static final class C54078b extends AbstractC89220m implements AbstractC89171a<C19638h> {

        /* renamed from: a */
        final /* synthetic */ GroupChatViewModel f123938a;

        static {
            Covode.recordClassIndex(63755);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54078b(GroupChatViewModel groupChatViewModel) {
            super(0);
            this.f123938a = groupChatViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C19638h invoke() {
            return this.f123938a.f123936f.mo27720a(this.f123938a.f123935e.getConversationId());
        }
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        super.onCleared();
        C19638h a = mo91175a();
        if (a != null) {
            long conversationShortId = a.getConversationShortId();
            C1213t<Integer> tVar = this.f123931a;
            C89219l.m154721d(tVar, "");
            CopyOnWriteArrayList<C1213t<Integer>> copyOnWriteArrayList = C55361a.f126583c.get(Long.valueOf(conversationShortId));
            if (copyOnWriteArrayList != null) {
                Objects.requireNonNull(copyOnWriteArrayList, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
                C89206ad.m154680b(copyOnWriteArrayList).remove(tVar);
            }
        }
    }

    public /* synthetic */ GroupChatViewModel(C54004b bVar) {
        this(bVar, AbstractC17420a.C17421a.m32276a());
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.viewmodel.GroupChatViewModel$c */
    static final class C54079c<I, O> implements AbstractC0189a {

        /* renamed from: a */
        public static final C54079c f123939a = new C54079c();

        static {
            Covode.recordClassIndex(63756);
        }

        C54079c() {
        }

        @Override // androidx.p012a.p013a.p016c.AbstractC0189a
        /* renamed from: a */
        public final /* synthetic */ Object mo365a(Object obj) {
            return Boolean.valueOf(C55339a.m101153b((C19638h) obj));
        }
    }

    private GroupChatViewModel(C54004b bVar, AbstractC17420a aVar) {
        Long l;
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        this.f123935e = bVar;
        this.f123936f = aVar;
        C1213t<Integer> tVar = new C1213t<>();
        this.f123931a = tVar;
        C1213t<C19638h> tVar2 = new C1213t<>();
        this.f123932b = tVar2;
        this.f123937h = C89250i.m154773a((AbstractC89171a) new C54078b(this));
        LiveData<Boolean> a = C1169aa.m3869a(tVar2, C54079c.f123939a);
        C89219l.m154716b(a, "");
        this.f123933c = a;
        this.f123934d = new C1213t<>();
        C19638h a2 = mo91175a();
        int i = 0;
        if (a2 != null) {
            long conversationShortId = a2.getConversationShortId();
            C89219l.m154721d(tVar, "");
            if (C55361a.f126583c.get(Long.valueOf(conversationShortId)) == null) {
                C55361a.f126583c.put(Long.valueOf(conversationShortId), new CopyOnWriteArrayList<>());
            }
            CopyOnWriteArrayList<C1213t<Integer>> copyOnWriteArrayList = C55361a.f126583c.get(Long.valueOf(conversationShortId));
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.add(tVar);
            }
            Integer num = C55361a.f126581a.get(Long.valueOf(conversationShortId));
            tVar.postValue(num != null ? num : i);
        } else {
            tVar.setValue(0);
        }
        tVar2.setValue(mo91175a());
        C19638h a3 = mo91175a();
        if (a3 != null) {
            C89219l.m154721d(a3, "");
            String conversationId = a3.getConversationId();
            C89219l.m154716b(conversationId, "");
            C54603a.f125153c = conversationId;
            C19639i coreInfo = a3.getCoreInfo();
            if (coreInfo != null) {
                l = Long.valueOf(coreInfo.getOwner());
            } else {
                l = null;
            }
            C54603a.m100107a(C89219l.m154714a((Object) String.valueOf(l), (Object) C55197c.m100919b().toString()));
        }
    }
}
