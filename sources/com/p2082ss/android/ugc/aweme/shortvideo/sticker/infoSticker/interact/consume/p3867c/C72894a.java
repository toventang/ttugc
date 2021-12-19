package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3867c;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.C72904d;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3865a.C72882a;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72925f;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3870f.C72932e;
import com.p2082ss.android.ugc.aweme.sticker.data.PollStruct;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4166g.C79440a;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c.a */
public final class C72894a extends AbstractC34586a implements AbstractC39063h.AbstractC39067a, AbstractC39102c<User> {

    /* renamed from: c */
    public static final C72895a f163557c = new C72895a((byte) 0);

    /* renamed from: a */
    public C72932e f163558a;

    /* renamed from: b */
    public AbstractC72925f f163559b;

    /* renamed from: d */
    private PollStruct f163560d;

    /* renamed from: e */
    private int f163561e;

    /* renamed from: j */
    private View f163562j;

    /* renamed from: k */
    private RecyclerView f163563k;

    /* renamed from: l */
    private TuxStatusView f163564l;

    /* renamed from: m */
    private C72882a f163565m;

    /* renamed from: n */
    private SparseArray f163566n;

    static {
        Covode.recordClassIndex(85589);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59511a(Exception exc) {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void bl_() {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59523c(List<User> list, boolean z) {
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c.a$a */
    public static final class C72895a {
        static {
            Covode.recordClassIndex(85590);
        }

        private C72895a() {
        }

        public /* synthetic */ C72895a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C72894a m128734a(int i, PollStruct pollStruct) {
            Bundle bundle = new Bundle();
            bundle.putInt("key_state", i);
            if (pollStruct != null) {
                bundle.putSerializable("key_poll", pollStruct);
            }
            C72894a aVar = new C72894a();
            aVar.setArguments(bundle);
            return aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c.a$b */
    static final /* synthetic */ class C72896b extends C89217j implements AbstractC89171a<C89391z> {
        static {
            Covode.recordClassIndex(85591);
        }

        C72896b(C72894a aVar) {
            super(0, aVar, C72894a.class, "tryToRefresh", "tryToRefresh()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            ((C72894a) this.receiver).mo115259a();
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void aW_() {
        C72882a aVar;
        if (af_() && (aVar = this.f163565m) != null) {
            aVar.ao_();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C72932e eVar = this.f163558a;
        if (eVar != null) {
            eVar.f163653b.dispose();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f163566n;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c.a$c */
    static final class RunnableC72897c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C72894a f163567a;

        /* renamed from: b */
        final /* synthetic */ C72904d f163568b;

        /* renamed from: c */
        final /* synthetic */ List f163569c;

        static {
            Covode.recordClassIndex(85592);
        }

        RunnableC72897c(C72894a aVar, C72904d dVar, List list) {
            this.f163567a = aVar;
            this.f163568b = dVar;
            this.f163569c = list;
        }

        public final void run() {
            C72932e eVar = this.f163567a.f163558a;
            if (eVar != null) {
                eVar.mo115324a(this.f163568b);
            }
            this.f163567a.mo59512a(this.f163569c, this.f163568b.f163596b);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59515b() {
        if (af_()) {
            TuxStatusView tuxStatusView = this.f163564l;
            if (tuxStatusView != null) {
                tuxStatusView.setVisibility(0);
            }
            TuxStatusView tuxStatusView2 = this.f163564l;
            if (tuxStatusView2 != null) {
                tuxStatusView2.mo37867a();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: f */
    public final void mo59525f() {
        if (af_()) {
            TuxStatusView tuxStatusView = this.f163564l;
            if (tuxStatusView != null) {
                tuxStatusView.setVisibility(0);
            }
            TuxStatusView tuxStatusView2 = this.f163564l;
            if (tuxStatusView2 != null) {
                TuxStatusView.C23263c cVar = new TuxStatusView.C23263c();
                String string = getString(R.string.ha2);
                C89219l.m154716b(string, "");
                tuxStatusView2.setStatus(cVar.mo37878a((CharSequence) string));
            }
        }
    }

    /* renamed from: a */
    public final void mo115259a() {
        PollStruct.OptionsBean optionsBean;
        PollStruct.OptionsBean optionsBean2;
        C72932e eVar = this.f163558a;
        if (eVar != null) {
            PollStruct pollStruct = this.f163560d;
            if (pollStruct == null) {
                C89219l.m154715b();
            }
            long pollId = pollStruct.getPollId();
            long j = 0;
            if (this.f163561e == 0) {
                PollStruct pollStruct2 = this.f163560d;
                if (pollStruct2 == null) {
                    C89219l.m154715b();
                }
                List<PollStruct.OptionsBean> options = pollStruct2.getOptions();
                if (!(options == null || (optionsBean2 = options.get(0)) == null)) {
                    j = optionsBean2.getOptionId();
                }
            } else {
                PollStruct pollStruct3 = this.f163560d;
                if (pollStruct3 == null) {
                    C89219l.m154715b();
                }
                List<PollStruct.OptionsBean> options2 = pollStruct3.getOptions();
                if (!(options2 == null || (optionsBean = options2.get(1)) == null)) {
                    j = optionsBean.getOptionId();
                }
            }
            eVar.mo115323a(pollId, j);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
    /* renamed from: l */
    public final void mo62679l() {
        PollStruct.OptionsBean optionsBean;
        PollStruct.OptionsBean optionsBean2;
        if (this.f163560d == null) {
            mo59525f();
        }
        C72932e eVar = this.f163558a;
        if (eVar != null) {
            PollStruct pollStruct = this.f163560d;
            if (pollStruct == null) {
                C89219l.m154715b();
            }
            long pollId = pollStruct.getPollId();
            long j = 0;
            if (this.f163561e == 0) {
                PollStruct pollStruct2 = this.f163560d;
                if (pollStruct2 == null) {
                    C89219l.m154715b();
                }
                List<PollStruct.OptionsBean> options = pollStruct2.getOptions();
                if (!(options == null || (optionsBean2 = options.get(0)) == null)) {
                    j = optionsBean2.getOptionId();
                }
            } else {
                PollStruct pollStruct3 = this.f163560d;
                if (pollStruct3 == null) {
                    C89219l.m154715b();
                }
                List<PollStruct.OptionsBean> options2 = pollStruct3.getOptions();
                if (!(options2 == null || (optionsBean = options2.get(1)) == null)) {
                    j = optionsBean.getOptionId();
                }
            }
            eVar.f163652a.getPollDetail(pollId, j, eVar.f163654c.f163595a).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new C72932e.C72933a(eVar));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59522c(Exception exc) {
        C72882a aVar;
        if (af_() && (aVar = this.f163565m) != null) {
            aVar.mo67823i();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59516b(Exception exc) {
        if (af_()) {
            TuxStatusView tuxStatusView = this.f163564l;
            if (tuxStatusView != null) {
                tuxStatusView.setVisibility(0);
            }
            TuxStatusView tuxStatusView2 = this.f163564l;
            if (tuxStatusView2 != null) {
                tuxStatusView2.setStatus(C79440a.m138171b(new TuxStatusView.C23263c(), new C72896b(this)));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        Serializable serializable;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            i = arguments.getInt("key_state");
        } else {
            i = 0;
        }
        this.f163561e = i;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            serializable = arguments2.getSerializable("key_poll");
        } else {
            serializable = null;
        }
        this.f163560d = (PollStruct) serializable;
        this.f163558a = new C72932e(this, this.f163559b, this.f163561e);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59512a(List<User> list, boolean z) {
        if (af_()) {
            if (!z) {
                C72882a aVar = this.f163565m;
                if (aVar != null) {
                    aVar.ap_();
                }
            } else {
                C72882a aVar2 = this.f163565m;
                if (aVar2 != null) {
                    aVar2.aq_();
                }
            }
            TuxStatusView tuxStatusView = this.f163564l;
            if (tuxStatusView != null) {
                tuxStatusView.setVisibility(8);
            }
            C72882a aVar3 = this.f163565m;
            if (aVar3 != null) {
                aVar3.mo62377b_(list);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59517b(List<User> list, boolean z) {
        List list2;
        if (af_()) {
            C72882a aVar = this.f163565m;
            if (aVar != null) {
                aVar.mo67829d(false);
            }
            if (!z) {
                C72882a aVar2 = this.f163565m;
                if (aVar2 != null) {
                    aVar2.ap_();
                }
            } else {
                C72882a aVar3 = this.f163565m;
                if (aVar3 != null) {
                    aVar3.aq_();
                }
            }
            C72882a aVar4 = this.f163565m;
            if (aVar4 == null || (list2 = aVar4.mo63369e()) == null) {
                list2 = new ArrayList();
            }
            if (list != null && !list.isEmpty()) {
                list2.addAll(list);
                C72882a aVar5 = this.f163565m;
                if (aVar5 != null) {
                    aVar5.mo62376b(list2);
                }
            }
            C72882a aVar6 = this.f163565m;
            if (aVar6 != null) {
                aVar6.mo67829d(true);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        if (com.bytedance.common.utility.collection.C13603b.m24435a((java.util.Collection) r3) != false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006a, code lost:
        if (com.bytedance.common.utility.collection.C13603b.m24435a((java.util.Collection) r3) != false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006d, code lost:
        mo59515b();
        r1 = r4.f163563k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0072, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0074, code lost:
        r1.post(new com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3867c.C72894a.RunnableC72897c(r4, r2, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r5, android.os.Bundle r6) {
        /*
        // Method dump skipped, instructions count: 125
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3867c.C72894a.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TuxStatusView tuxStatusView;
        C89219l.m154721d(layoutInflater, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.bix, viewGroup, false);
        this.f163562j = a;
        RecyclerView recyclerView = null;
        if (a != null) {
            tuxStatusView = (TuxStatusView) a.findViewById(R.id.e7i);
        } else {
            tuxStatusView = null;
        }
        this.f163564l = tuxStatusView;
        if (a != null) {
            recyclerView = (RecyclerView) a.findViewById(R.id.dgz);
        }
        this.f163563k = recyclerView;
        C72882a aVar = new C72882a();
        this.f163565m = aVar;
        aVar.mo67813a((AbstractC39063h.AbstractC39067a) this);
        RecyclerView recyclerView2 = this.f163563k;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.f163565m);
        }
        RecyclerView recyclerView3 = this.f163563k;
        if (recyclerView3 != null) {
            getContext();
            recyclerView3.setLayoutManager(new LinearLayoutManager());
        }
        return this.f163562j;
    }
}
