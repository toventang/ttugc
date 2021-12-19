package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.read.viewmodel;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.C17419b;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17434e;
import com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19587an;
import com.bytedance.p1399im.core.p1408d.C19593ar;
import com.bytedance.p1399im.core.p1408d.C19600ay;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.C53709a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.read.data.manager.ReadStateMarkDelegate;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.read.data.manager.ReadStateSyncDelegate;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3081a.AbstractC53632a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3134b.AbstractC54406a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.ReadStateViewModel */
public final class ReadStateViewModel extends AbstractC1174ac implements AbstractC17425d, AbstractC53632a, AbstractC54142b.AbstractC54143a, AbstractC54406a {

    /* renamed from: b */
    public static final boolean f124327b = false;

    /* renamed from: c */
    public static final C54274a f124328c = new C54274a((byte) 0);

    /* renamed from: a */
    public final C54278a f124329a;

    /* renamed from: d */
    private final AbstractC89244h f124330d = C89250i.m154773a((AbstractC89171a) C54275b.f124333a);

    /* renamed from: e */
    private final AbstractC89244h f124331e = C89250i.m154773a((AbstractC89171a) new C54276c(this));

    /* renamed from: f */
    private final AbstractC89244h f124332f = C89250i.m154773a((AbstractC89171a) new C54277d(this));

    static {
        Covode.recordClassIndex(63967);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d, com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27789a(int i, C19538ai aiVar) {
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d, com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27790a(int i, C19538ai aiVar, C19600ay ayVar) {
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d, com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27791a(int i, C19587an anVar) {
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d, com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27792a(C19538ai aiVar) {
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d, com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27793a(C19538ai aiVar, Map map, Map map2) {
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d, com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27794a(C19538ai aiVar, boolean z) {
    }

    /* renamed from: b */
    public final ReadStateMarkDelegate mo91363b() {
        return (ReadStateMarkDelegate) this.f124331e.getValue();
    }

    /* renamed from: c */
    public final ReadStateSyncDelegate mo91364c() {
        return (ReadStateSyncDelegate) this.f124332f.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.ReadStateViewModel$a */
    public static final class C54274a {
        static {
            Covode.recordClassIndex(63968);
        }

        private C54274a() {
        }

        public /* synthetic */ C54274a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3134b.AbstractC54406a
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    public final void onCreate() {
        AbstractC54406a.C54407a.onCreate(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3134b.AbstractC54406a
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public final void onPause() {
        AbstractC54406a.C54407a.onPause(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3134b.AbstractC54406a
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void onResume() {
        AbstractC54406a.C54407a.onResume(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3134b.AbstractC54406a
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_START)
    public final void onStart() {
        AbstractC54406a.C54407a.onStart(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3134b.AbstractC54406a
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
    public final void onStop() {
        AbstractC54406a.C54407a.onStop(this);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d, com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27798a(List<C19538ai> list, boolean z) {
        C56244a.m102190b("ReadStateViewModel", "onLoadOlder: " + (list != null ? Integer.valueOf(list.size()) : null));
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.ReadStateViewModel$b */
    static final class C54275b extends AbstractC89220m implements AbstractC89171a<C33943c<Integer>> {

        /* renamed from: a */
        public static final C54275b f124333a = new C54275b();

        static {
            Covode.recordClassIndex(63969);
        }

        C54275b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C33943c<Integer> invoke() {
            return new C33943c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.ReadStateViewModel$c */
    static final class C54276c extends AbstractC89220m implements AbstractC89171a<ReadStateMarkDelegate> {

        /* renamed from: a */
        final /* synthetic */ ReadStateViewModel f124334a;

        static {
            Covode.recordClassIndex(63970);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54276c(ReadStateViewModel readStateViewModel) {
            super(0);
            this.f124334a = readStateViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ReadStateMarkDelegate invoke() {
            return new ReadStateMarkDelegate(this.f124334a.f124329a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.ReadStateViewModel$d */
    static final class C54277d extends AbstractC89220m implements AbstractC89171a<ReadStateSyncDelegate> {

        /* renamed from: a */
        final /* synthetic */ ReadStateViewModel f124335a;

        static {
            Covode.recordClassIndex(63971);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54277d(ReadStateViewModel readStateViewModel) {
            super(0);
            this.f124335a = readStateViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ReadStateSyncDelegate invoke() {
            return new ReadStateSyncDelegate(this.f124335a.f124329a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b.AbstractC54143a
    /* renamed from: a */
    public final void mo91256a() {
        C56244a.m102190b("ReadStateViewModel", "onInputting");
        mo91363b().mo91350b();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3081a.AbstractC53632a
    /* renamed from: e */
    public final void mo90199e() {
        C56244a.m102190b("ReadStateViewModel", "onNewestMessageVisible");
        mo91363b().mo91350b();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3134b.AbstractC54406a
    public final void onDestroy() {
        C17419b.m32261a().mo27893b(this.f124329a.f124336a.mo27757a(), this);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3081a.AbstractC53632a
    /* renamed from: a */
    public final void mo90195a(List<C19538ai> list) {
        if (list != null) {
            Integer.valueOf(list.size());
            if (!list.isEmpty()) {
                this.f124329a.mo91368b().clear();
                C89070n.m154552a((Iterable) list, (Collection) this.f124329a.mo91368b());
                mo91363b().bG_();
                mo91364c().bG_();
            }
        }
    }

    public ReadStateViewModel(AbstractC17434e eVar, C53709a aVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(aVar, "");
        this.f124329a = new C54278a(eVar, aVar);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d, com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: b */
    public final void mo27799b(List<C19538ai> list, boolean z) {
        Integer num;
        StringBuilder sb = new StringBuilder("onLoadNewer: ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        C56244a.m102190b("ReadStateViewModel", sb.append(num).toString());
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d, com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27797a(List<C19538ai> list, Map<String, Map<String, String>> map) {
        Integer num;
        StringBuilder sb = new StringBuilder("onUpdateMessage: ");
        Integer num2 = null;
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        StringBuilder append = sb.append(num).append("  && ");
        if (map != null) {
            num2 = Integer.valueOf(map.size());
        }
        C56244a.m102190b("ReadStateViewModel", append.append(num2).toString());
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d, com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27795a(List<C19538ai> list, int i, C19593ar arVar) {
        Integer num;
        C89219l.m154721d(arVar, "");
        StringBuilder sb = new StringBuilder("onGetMessage: ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        C56244a.m102190b("ReadStateViewModel", sb.append(num).append(' ').append(i).append("  ").append(arVar).toString());
        mo91363b().mo91349a();
        mo91364c().mo91349a();
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d, com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27796a(List<C19538ai> list, int i, String str) {
        Integer num;
        StringBuilder sb = new StringBuilder("onQueryMessage: ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        C56244a.m102190b("ReadStateViewModel", sb.append(num).toString());
    }
}
