package com.p2082ss.android.ugc.aweme.tools.draft.viewmodel;

import android.app.ProgressDialog;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.C43225d;
import com.p2082ss.android.ugc.aweme.metrics.C59213ah;
import com.p2082ss.android.ugc.aweme.p2304af.C33429a;
import com.p2082ss.android.ugc.aweme.p2730de.C40964c;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.setting.C68040by;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72867e;
import com.p2082ss.android.ugc.aweme.tools.draft.C78133ai;
import com.p2082ss.android.ugc.aweme.tools.draft.p4103d.C78230a;
import com.p2082ss.android.ugc.aweme.tools.draft.p4103d.C78231b;
import com.p2082ss.android.ugc.aweme.tools.draft.p4103d.C78232c;
import com.p2082ss.android.ugc.aweme.tools.draft.p4103d.C78233d;
import com.p2082ss.android.ugc.aweme.tools.draft.p4103d.C78236g;
import com.p2082ss.android.ugc.aweme.tools.draft.p4103d.C78237h;
import com.p2082ss.android.ugc.aweme.tools.draft.p4103d.C78239j;
import com.p2082ss.android.ugc.aweme.tools.draft.p4103d.C78240k;
import com.p2082ss.android.ugc.aweme.tools.draft.p4103d.C78241l;
import com.p2082ss.android.ugc.aweme.tools.draft.p4103d.C78242m;
import com.p2082ss.android.ugc.aweme.tools.draft.p4103d.C78243n;
import com.p2082ss.android.ugc.aweme.tools.draft.p4112j.C78397c;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80285bz;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.aweme.utils.C80419fb;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.C89517an;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.C89378p;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89110d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel */
public final class DraftViewModel extends AbstractC1174ac {

    /* renamed from: a */
    public final String f176288a = "DraftViewModel";

    /* renamed from: b */
    public final Set<C78232c> f176289b = new HashSet();

    /* renamed from: c */
    public final List<C78230a> f176290c = new ArrayList();

    /* renamed from: d */
    public final C1213t<Boolean> f176291d = new C1213t<>();

    /* renamed from: e */
    public final C1213t<C89378p<C43223c, Boolean>> f176292e = new C1213t<>();

    /* renamed from: f */
    public final C1213t<C43223c> f176293f = new C1213t<>();

    /* renamed from: g */
    public final C1213t<C78469c> f176294g = new C1213t<>();

    /* renamed from: h */
    public final C78467a f176295h = new C78467a();

    /* renamed from: i */
    public final AbstractC89516am f176296i = C89517an.m155448a(C33429a.f79465a);

    /* renamed from: j */
    private boolean f176297j;

    /* renamed from: k */
    private boolean f176298k;

    /* renamed from: l */
    private boolean f176299l;

    /* renamed from: m */
    private boolean f176300m;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$d */
    public static final class C78458d extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f176306a;

        /* renamed from: b */
        int f176307b;

        /* renamed from: c */
        final /* synthetic */ DraftViewModel f176308c;

        /* renamed from: d */
        Object f176309d;

        /* renamed from: e */
        Object f176310e;

        static {
            Covode.recordClassIndex(91587);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78458d(DraftViewModel draftViewModel, AbstractC89124d dVar) {
            super(dVar);
            this.f176308c = draftViewModel;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f176306a = obj;
            this.f176307b |= Integer.MIN_VALUE;
            return this.f176308c.mo122377a(null, this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$h */
    public static final class C78462h extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f176321a;

        /* renamed from: b */
        int f176322b;

        /* renamed from: c */
        final /* synthetic */ DraftViewModel f176323c;

        /* renamed from: d */
        Object f176324d;

        static {
            Covode.recordClassIndex(91591);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78462h(DraftViewModel draftViewModel, AbstractC89124d dVar) {
            super(dVar);
            this.f176323c = draftViewModel;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f176321a = obj;
            this.f176322b |= Integer.MIN_VALUE;
            return this.f176323c.mo122374a(0, 0, (String) null, this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$i */
    public static final class C78463i extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f176325a;

        /* renamed from: b */
        int f176326b;

        /* renamed from: c */
        final /* synthetic */ DraftViewModel f176327c;

        /* renamed from: d */
        Object f176328d;

        static {
            Covode.recordClassIndex(91592);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78463i(DraftViewModel draftViewModel, AbstractC89124d dVar) {
            super(dVar);
            this.f176327c = draftViewModel;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f176325a = obj;
            this.f176326b |= Integer.MIN_VALUE;
            return this.f176327c.mo122375a(0, 0, (List<String>) null, this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$j */
    public static final class C78464j extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f176329a;

        /* renamed from: b */
        int f176330b;

        /* renamed from: c */
        final /* synthetic */ DraftViewModel f176331c;

        /* renamed from: d */
        Object f176332d;

        static {
            Covode.recordClassIndex(91593);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78464j(DraftViewModel draftViewModel, AbstractC89124d dVar) {
            super(dVar);
            this.f176331c = draftViewModel;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f176329a = obj;
            this.f176330b |= Integer.MIN_VALUE;
            return this.f176331c.mo122381b(0, 0, (String) null, this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$k */
    public static final class C78465k extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f176333a;

        /* renamed from: b */
        int f176334b;

        /* renamed from: c */
        final /* synthetic */ DraftViewModel f176335c;

        /* renamed from: d */
        Object f176336d;

        static {
            Covode.recordClassIndex(91594);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78465k(DraftViewModel draftViewModel, AbstractC89124d dVar) {
            super(dVar);
            this.f176335c = draftViewModel;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f176333a = obj;
            this.f176334b |= Integer.MIN_VALUE;
            return this.f176335c.mo122382b(0, 0, (List<String>) null, this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$l */
    public static final class C78466l extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f176337a;

        /* renamed from: b */
        int f176338b;

        /* renamed from: c */
        final /* synthetic */ DraftViewModel f176339c;

        /* renamed from: d */
        Object f176340d;

        /* renamed from: e */
        Object f176341e;

        /* renamed from: f */
        Object f176342f;

        static {
            Covode.recordClassIndex(91595);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78466l(DraftViewModel draftViewModel, AbstractC89124d dVar) {
            super(dVar);
            this.f176339c = draftViewModel;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f176337a = obj;
            this.f176338b |= Integer.MIN_VALUE;
            return this.f176339c.mo122376a(null, null, this);
        }
    }

    static {
        Covode.recordClassIndex(91583);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo122380a() {
        /*
            r4 = this;
            java.util.List<com.ss.android.ugc.aweme.tools.draft.d.a> r0 = r4.f176290c
            java.util.Iterator r3 = r0.iterator()
        L_0x0006:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0024
            java.lang.Object r2 = r3.next()
            com.ss.android.ugc.aweme.tools.draft.d.a r2 = (com.p2082ss.android.ugc.aweme.tools.draft.p4103d.C78230a) r2
            int r1 = r2.mo122123a()
            r0 = 101(0x65, float:1.42E-43)
            if (r1 == r0) goto L_0x0022
            int r1 = r2.mo122123a()
            r0 = 106(0x6a, float:1.49E-43)
            if (r1 != r0) goto L_0x0006
        L_0x0022:
            r0 = 0
            return r0
        L_0x0024:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel.mo122380a():boolean");
    }

    /* renamed from: a */
    public final void mo122378a(C78232c cVar) {
        int indexOf = this.f176290c.indexOf(cVar);
        if (indexOf != 0 && cVar.f175711h.length() != 0) {
            int i = indexOf - 1;
            if (this.f176290c.get(i).mo122123a() == 103) {
                C78230a aVar = this.f176290c.get(i);
                if (indexOf != this.f176290c.size() - 1) {
                    int i2 = indexOf + 1;
                    if (this.f176290c.get(i2).mo122123a() == 101) {
                        if (this.f176290c.get(i2).mo122123a() == 101) {
                            C78230a aVar2 = this.f176290c.get(i2);
                            Objects.requireNonNull(aVar2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.tools.draft.entity.DraftCommonDetails");
                            C78232c cVar2 = (C78232c) aVar2;
                            if (cVar2.f175710g.length() == 0 || (!C89219l.m154714a((Object) cVar2.f175710g, (Object) cVar.f175710g))) {
                                this.f176290c.remove(aVar);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                this.f176290c.remove(aVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$c */
    public static final class C78457c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C78457c f176305a = new C78457c();

        static {
            Covode.recordClassIndex(91586);
        }

        C78457c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C63238c.f143581h.mo101743a();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$b */
    public static final class C78456b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ ProgressDialog f176304a;

        static {
            Covode.recordClassIndex(91585);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78456b(ProgressDialog progressDialog) {
            super(0);
            this.f176304a = progressDialog;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            ProgressDialog progressDialog = this.f176304a;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public final void mo122383b() {
        this.f176297j = false;
        this.f176298k = false;
        this.f176299l = false;
        this.f176300m = false;
        this.f176290c.clear();
        this.f176295h.mo122386a();
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        super.onCleared();
        C84911q.m145921a(this.f176288a + " -> onCleared: ");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$e */
    public static final class C78459e extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f176311a;

        /* renamed from: b */
        final /* synthetic */ C43223c f176312b;

        /* renamed from: c */
        final /* synthetic */ String f176313c;

        static {
            Covode.recordClassIndex(91588);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78459e(C43223c cVar, String str, AbstractC89124d dVar) {
            super(2, dVar);
            this.f176312b = cVar;
            this.f176313c = str;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C78459e(this.f176312b, this.f176313c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C78459e) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f176311a == 0) {
                C89382r.m154942a(obj);
                C78133ai.m136600a().mo122073b(this.f176312b, this.f176313c);
                C43225d.m86337g(this.f176312b);
                C72867e.m128688b(this.f176312b.mo73676f());
                C80285bz.m139188b(this.f176312b);
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$f */
    public static final class C78460f extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f176314a;

        /* renamed from: b */
        final /* synthetic */ DraftViewModel f176315b;

        /* renamed from: c */
        final /* synthetic */ String f176316c;

        static {
            Covode.recordClassIndex(91589);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78460f(DraftViewModel draftViewModel, String str, AbstractC89124d dVar) {
            super(2, dVar);
            this.f176315b = draftViewModel;
            this.f176316c = str;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C78460f(this.f176315b, this.f176316c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C78460f) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f176314a;
            if (i == 0) {
                C89382r.m154942a(obj);
                DraftViewModel draftViewModel = this.f176315b;
                String str = this.f176316c;
                this.f176314a = 1;
                if (draftViewModel.mo122377a(str, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C78397c.m136927a().notifyDraftDelete(null);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo122379a(ArrayList<C78232c> arrayList) {
        Iterator<C78232c> it = arrayList.iterator();
        while (it.hasNext()) {
            C78232c next = it.next();
            if (next instanceof C78233d) {
                mo122378a(next);
                mo122384b(next);
            }
            this.f176290c.remove(next);
        }
        if (mo122380a()) {
            this.f176290c.clear();
        }
        C80419fb.m139411a(this.f176291d, true);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$g */
    public static final class C78461g extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        Object f176317a;

        /* renamed from: b */
        int f176318b;

        /* renamed from: c */
        final /* synthetic */ DraftViewModel f176319c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f176320d;

        static {
            Covode.recordClassIndex(91590);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78461g(DraftViewModel draftViewModel, ArrayList arrayList, AbstractC89124d dVar) {
            super(2, dVar);
            this.f176319c = draftViewModel;
            this.f176320d = arrayList;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C78461g(this.f176319c, this.f176320d, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C78461g) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f176318b;
            if (i == 0) {
                C89382r.m154942a(obj);
                it = this.f176320d.iterator();
            } else if (i == 1) {
                it = (Iterator) this.f176317a;
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            while (it.hasNext()) {
                DraftViewModel draftViewModel = this.f176319c;
                String str = ((C78232c) it.next()).f175706c;
                this.f176317a = it;
                this.f176318b = 1;
                if (draftViewModel.mo122377a(str, this) == aVar) {
                    return aVar;
                }
            }
            C78397c.m136927a().notifyDraftDelete(null);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private final boolean m136985a(C78237h hVar) {
        C78243n nVar = new C78243n((byte) 0);
        if (!this.f176297j && C78468b.m137002a(hVar.f175729b.f175726f)) {
            nVar.f175740c = R.string.fn8;
            this.f176297j = true;
        } else if (!this.f176298k && C78468b.m137003b(hVar.f175729b.f175726f)) {
            nVar.f175740c = R.string.fn9;
            this.f176298k = true;
        } else if (!this.f176299l && C78468b.m137004c(hVar.f175729b.f175726f)) {
            nVar.f175740c = R.string.fn7;
            this.f176299l = true;
        } else if (this.f176300m || !C78468b.m137005d(hVar.f175729b.f175726f)) {
            return false;
        } else {
            nVar.f175740c = R.string.fn6;
            this.f176300m = true;
        }
        this.f176290c.add(nVar);
        return true;
    }

    /* renamed from: a */
    private final void m136984a(List<C78237h> list) {
        if (!list.isEmpty()) {
            if (this.f176290c.size() == 0) {
                this.f176290c.add(new C78239j((byte) 0));
            }
            if (this.f176290c.size() > 1) {
                List<C78230a> list2 = this.f176290c;
                list2.remove(list2.size() - 1);
            }
            for (C78237h hVar : list) {
                boolean a = m136985a(hVar);
                boolean b = m136987b(hVar);
                if (!a && !b && hVar.f175729b.f175724d.length() > 0) {
                    List<C78230a> list3 = this.f176290c;
                    C78230a aVar = list3.get(list3.size() - 1);
                    if (aVar instanceof C78233d) {
                        C78233d dVar = (C78233d) aVar;
                        if (dVar.f175710g.length() > 0) {
                            dVar.f175715l = false;
                            List<C78230a> list4 = this.f176290c;
                            list4.set(list4.size() - 1, aVar);
                        }
                    }
                }
                C78233d dVar2 = new C78233d(101, hVar.f175728a, hVar.f175729b.f175723c, hVar.f175730c.f175719c, hVar.f175729b.f175724d, hVar.f175729b.f175725e, hVar.f175729b.f175721a, hVar.f175729b.f175722b, false, 1792);
                if (dVar2.f175712i == 101 && this.f176290c.size() > 0) {
                    List<C78230a> list5 = this.f176290c;
                    if (list5.get(list5.size() - 1).mo122123a() == 101) {
                        dVar2.f175716m = true;
                    }
                }
                this.f176290c.add(dVar2);
            }
            this.f176290c.add(new C78240k((byte) 0));
            C80419fb.m139411a(this.f176291d, true);
        }
    }

    /* renamed from: b */
    private final void m136986b(List<C78237h> list) {
        if (!list.isEmpty()) {
            if (this.f176290c.size() == 0) {
                this.f176290c.add(new C78239j((byte) 0));
                this.f176290c.add(new C78240k((byte) 0));
                this.f176290c.add(new C78231b((byte) 0));
            }
            for (C78237h hVar : list) {
                List<C78230a> list2 = this.f176290c;
                list2.add(list2.size() - 2, new C78242m(106, hVar.f175728a, hVar.f175729b.f175723c, hVar.f175730c.f175719c, hVar.f175729b.f175724d, C78236g.m136718a(hVar), 64));
            }
            C84911q.m145921a(this.f176288a + " -> dealDraftViewInfosForNewUI: draftList.size = " + this.f176290c.size());
            C80419fb.m139411a(this.f176291d, true);
        }
    }

    /* renamed from: b */
    private final boolean m136987b(C78237h hVar) {
        if (hVar.f175729b.f175725e.length() > 0) {
            List<C78230a> list = this.f176290c;
            C78230a aVar = list.get(list.size() - 1);
            int a = aVar.mo122123a();
            if (a == 101) {
                Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.tools.draft.entity.DraftDetails");
                if (!C89219l.m154714a((Object) ((C78232c) aVar).f175711h, (Object) hVar.f175729b.f175725e)) {
                    C78241l lVar = new C78241l();
                    lVar.mo122137a(hVar.f175729b.f175724d);
                    lVar.mo122138b(hVar.f175728a);
                    this.f176290c.add(lVar);
                    return true;
                }
            } else if (a == 102) {
                C78241l lVar2 = new C78241l();
                lVar2.mo122137a(hVar.f175729b.f175724d);
                lVar2.mo122138b(hVar.f175728a);
                this.f176290c.add(lVar2);
                return true;
            } else if (a == 105) {
                C78241l lVar3 = new C78241l();
                lVar3.mo122137a(hVar.f175729b.f175724d);
                lVar3.mo122138b(hVar.f175728a);
                this.f176290c.add(lVar3);
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo122384b(C78232c cVar) {
        int i;
        int indexOf = this.f176290c.indexOf(cVar);
        if (indexOf != 0) {
            C78230a aVar = this.f176290c.get(indexOf - 1);
            if (aVar.mo122123a() != 102) {
                return;
            }
            if (indexOf == this.f176290c.size() - 1 || ((i = indexOf + 1) < this.f176290c.size() && this.f176290c.get(i).mo122123a() == 102)) {
                this.f176290c.remove(aVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$a */
    public static final class C78455a extends AbstractC89220m implements AbstractC89183m<Boolean, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ DraftViewModel f176301a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f176302b;

        /* renamed from: c */
        final /* synthetic */ C43223c f176303c;

        static {
            Covode.recordClassIndex(91584);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78455a(DraftViewModel draftViewModel, ActivityC0945e eVar, C43223c cVar) {
            super(2);
            this.f176301a = draftViewModel;
            this.f176302b = eVar;
            this.f176303c = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Boolean bool, String str) {
            Boolean bool2 = bool;
            String str2 = str;
            if (bool2 == null) {
                C89219l.m154715b();
            }
            if (bool2.booleanValue()) {
                C40964c cVar = C40964c.C40968c.f95804a;
                C89219l.m154716b(cVar, "");
                if (cVar.mo70144a()) {
                    C84911q.m145928d("app is running background");
                } else {
                    C69905c clone = this.f176303c.f100906f.clone();
                    C89219l.m154716b(clone, "");
                    C69905c cVar2 = new C69905c();
                    C89219l.m154721d(cVar2, "");
                    C80322d.m139251a("shoot", new C84425b().mo129406a("shoot_way", "draft_again").mo129406a("music_id", cVar2.getMusicId()).mo129407a("is_ui_shoot", true).f188764a);
                    clone.setMusicPriority(99);
                    C70005cr.m123611a().mo70083a(clone);
                    String str3 = this.f176303c.f100908h;
                    C89219l.m154716b(str3, "");
                    int i = this.f176303c.f100914n;
                    C40970e.m82485a("toVideoRecord() called with: path = [" + str3 + "], context = [], musicModel = [" + clone + "], start = [" + i + ']');
                    try {
                        new JSONObject().put("route", "1");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    C59213ah.f134852a = "draft_page";
                    C78469c cVar3 = new C78469c();
                    String musicId = clone.getMusicId();
                    C89219l.m154716b(musicId, "");
                    C89219l.m154721d(musicId, "");
                    cVar3.f176344a = musicId;
                    C89219l.m154721d(str3, "");
                    cVar3.f176345b = str3;
                    cVar3.f176346c = i;
                    if (C68040by.m120336a()) {
                        String str4 = this.f176303c.f100892O;
                        C89219l.m154716b(str4, "");
                        C89219l.m154721d(str4, "");
                        cVar3.f176347d = str4;
                    }
                    C80419fb.m139411a(this.f176301a.f176294g, cVar3);
                }
            } else if (TextUtils.isEmpty(str2)) {
                new C79459a(this.f176302b).mo123050a(R.string.dau).mo123053a();
            } else if (str2 != null) {
                new C23144b(this.f176302b).mo37635a(str2).mo37637b();
            }
            return C89391z.f203057a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo122377a(java.lang.String r9, p4600h.p4603c.AbstractC89124d<? super p4600h.C89391z> r10) {
        /*
        // Method dump skipped, instructions count: 174
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel.mo122377a(java.lang.String, h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c8 A[Catch:{ all -> 0x00f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f1 A[Catch:{ all -> 0x00f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo122376a(com.p2082ss.android.ugc.aweme.tools.draft.p4103d.C78232c r10, com.p2082ss.android.ugc.aweme.tools.draft.p4102c.C78215b r11, p4600h.p4603c.AbstractC89124d<? super p4600h.C89391z> r12) {
        /*
        // Method dump skipped, instructions count: 298
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel.mo122376a(com.ss.android.ugc.aweme.tools.draft.d.c, com.ss.android.ugc.aweme.tools.draft.c.b, h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo122381b(int r6, int r7, java.lang.String r8, p4600h.p4603c.AbstractC89124d<? super p4600h.C89391z> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.p2082ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel.C78464j
            if (r0 == 0) goto L_0x0048
            r4 = r9
            com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$j r4 = (com.p2082ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel.C78464j) r4
            int r0 = r4.f176330b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0048
            int r0 = r4.f176330b
            int r0 = r0 - r1
            r4.f176330b = r0
        L_0x0013:
            java.lang.Object r3 = r4.f176329a
            h.c.a.a r2 = p4600h.p4603c.p4604a.EnumC89098a.COROUTINE_SUSPENDED
            int r0 = r4.f176330b
            r1 = 1
            if (r0 == 0) goto L_0x0036
            if (r0 != r1) goto L_0x0054
            java.lang.Object r0 = r4.f176332d
            com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel r0 = (com.p2082ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel) r0
            p4600h.C89382r.m154942a(r3)
        L_0x0025:
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L_0x004e
            androidx.lifecycle.t<java.lang.Boolean> r1 = r0.f176291d
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.p2082ss.android.ugc.aweme.utils.C80419fb.m139411a(r1, r0)
            h.z r0 = p4600h.C89391z.f203057a
            return r0
        L_0x0036:
            p4600h.C89382r.m154942a(r3)
            com.ss.android.ugc.aweme.tools.draft.b.b r0 = com.p2082ss.android.ugc.aweme.tools.draft.p4101b.C78188b.f175598d
            r4.f176332d = r5
            r4.f176330b = r1
            java.lang.Object r3 = r0.mo122113b(r6, r7, r8, r4)
            if (r3 != r2) goto L_0x0046
            return r2
        L_0x0046:
            r0 = r5
            goto L_0x0025
        L_0x0048:
            com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$j r4 = new com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$j
            r4.<init>(r5, r9)
            goto L_0x0013
        L_0x004e:
            r0.m136986b(r3)
            h.z r0 = p4600h.C89391z.f203057a
            return r0
        L_0x0054:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel.mo122381b(int, int, java.lang.String, h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo122374a(int r6, int r7, java.lang.String r8, p4600h.p4603c.AbstractC89124d<? super p4600h.C89391z> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.p2082ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel.C78462h
            if (r0 == 0) goto L_0x0048
            r4 = r9
            com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$h r4 = (com.p2082ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel.C78462h) r4
            int r0 = r4.f176322b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0048
            int r0 = r4.f176322b
            int r0 = r0 - r1
            r4.f176322b = r0
        L_0x0013:
            java.lang.Object r3 = r4.f176321a
            h.c.a.a r2 = p4600h.p4603c.p4604a.EnumC89098a.COROUTINE_SUSPENDED
            int r0 = r4.f176322b
            r1 = 1
            if (r0 == 0) goto L_0x0036
            if (r0 != r1) goto L_0x0054
            java.lang.Object r0 = r4.f176324d
            com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel r0 = (com.p2082ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel) r0
            p4600h.C89382r.m154942a(r3)
        L_0x0025:
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L_0x004e
            androidx.lifecycle.t<java.lang.Boolean> r1 = r0.f176291d
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.p2082ss.android.ugc.aweme.utils.C80419fb.m139411a(r1, r0)
            h.z r0 = p4600h.C89391z.f203057a
            return r0
        L_0x0036:
            p4600h.C89382r.m154942a(r3)
            com.ss.android.ugc.aweme.tools.draft.b.b r0 = com.p2082ss.android.ugc.aweme.tools.draft.p4101b.C78188b.f175598d
            r4.f176324d = r5
            r4.f176322b = r1
            java.lang.Object r3 = r0.mo122109a(r6, r7, r8, r4)
            if (r3 != r2) goto L_0x0046
            return r2
        L_0x0046:
            r0 = r5
            goto L_0x0025
        L_0x0048:
            com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$h r4 = new com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$h
            r4.<init>(r5, r9)
            goto L_0x0013
        L_0x004e:
            r0.m136984a(r3)
            h.z r0 = p4600h.C89391z.f203057a
            return r0
        L_0x0054:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel.mo122374a(int, int, java.lang.String, h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo122375a(int r6, int r7, java.util.List<java.lang.String> r8, p4600h.p4603c.AbstractC89124d<? super p4600h.C89391z> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.p2082ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel.C78463i
            if (r0 == 0) goto L_0x0048
            r4 = r9
            com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$i r4 = (com.p2082ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel.C78463i) r4
            int r0 = r4.f176326b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0048
            int r0 = r4.f176326b
            int r0 = r0 - r1
            r4.f176326b = r0
        L_0x0013:
            java.lang.Object r3 = r4.f176325a
            h.c.a.a r2 = p4600h.p4603c.p4604a.EnumC89098a.COROUTINE_SUSPENDED
            int r0 = r4.f176326b
            r1 = 1
            if (r0 == 0) goto L_0x0036
            if (r0 != r1) goto L_0x0054
            java.lang.Object r0 = r4.f176328d
            com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel r0 = (com.p2082ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel) r0
            p4600h.C89382r.m154942a(r3)
        L_0x0025:
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L_0x004e
            androidx.lifecycle.t<java.lang.Boolean> r1 = r0.f176291d
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.p2082ss.android.ugc.aweme.utils.C80419fb.m139411a(r1, r0)
            h.z r0 = p4600h.C89391z.f203057a
            return r0
        L_0x0036:
            p4600h.C89382r.m154942a(r3)
            com.ss.android.ugc.aweme.tools.draft.b.b r0 = com.p2082ss.android.ugc.aweme.tools.draft.p4101b.C78188b.f175598d
            r4.f176328d = r5
            r4.f176326b = r1
            java.lang.Object r3 = r0.mo122110a(r6, r7, r8, r4)
            if (r3 != r2) goto L_0x0046
            return r2
        L_0x0046:
            r0 = r5
            goto L_0x0025
        L_0x0048:
            com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$i r4 = new com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$i
            r4.<init>(r5, r9)
            goto L_0x0013
        L_0x004e:
            r0.m136984a(r3)
            h.z r0 = p4600h.C89391z.f203057a
            return r0
        L_0x0054:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel.mo122375a(int, int, java.util.List, h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo122382b(int r6, int r7, java.util.List<java.lang.String> r8, p4600h.p4603c.AbstractC89124d<? super p4600h.C89391z> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.p2082ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel.C78465k
            if (r0 == 0) goto L_0x0048
            r4 = r9
            com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$k r4 = (com.p2082ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel.C78465k) r4
            int r0 = r4.f176334b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0048
            int r0 = r4.f176334b
            int r0 = r0 - r1
            r4.f176334b = r0
        L_0x0013:
            java.lang.Object r3 = r4.f176333a
            h.c.a.a r2 = p4600h.p4603c.p4604a.EnumC89098a.COROUTINE_SUSPENDED
            int r0 = r4.f176334b
            r1 = 1
            if (r0 == 0) goto L_0x0036
            if (r0 != r1) goto L_0x0054
            java.lang.Object r0 = r4.f176336d
            com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel r0 = (com.p2082ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel) r0
            p4600h.C89382r.m154942a(r3)
        L_0x0025:
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L_0x004e
            androidx.lifecycle.t<java.lang.Boolean> r1 = r0.f176291d
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.p2082ss.android.ugc.aweme.utils.C80419fb.m139411a(r1, r0)
            h.z r0 = p4600h.C89391z.f203057a
            return r0
        L_0x0036:
            p4600h.C89382r.m154942a(r3)
            com.ss.android.ugc.aweme.tools.draft.b.b r0 = com.p2082ss.android.ugc.aweme.tools.draft.p4101b.C78188b.f175598d
            r4.f176336d = r5
            r4.f176334b = r1
            java.lang.Object r3 = r0.mo122114b(r6, r7, r8, r4)
            if (r3 != r2) goto L_0x0046
            return r2
        L_0x0046:
            r0 = r5
            goto L_0x0025
        L_0x0048:
            com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$k r4 = new com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$k
            r4.<init>(r5, r9)
            goto L_0x0013
        L_0x004e:
            r0.m136986b(r3)
            h.z r0 = p4600h.C89391z.f203057a
            return r0
        L_0x0054:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel.mo122382b(int, int, java.util.List, h.c.d):java.lang.Object");
    }
}
