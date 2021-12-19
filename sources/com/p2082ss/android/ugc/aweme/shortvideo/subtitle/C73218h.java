package com.p2082ss.android.ugc.aweme.shortvideo.subtitle;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.p2724cz.C40903b;
import com.p2082ss.android.ugc.aweme.property.C65438du;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene;
import com.p2082ss.android.ugc.aweme.sticker.data.C75313h;
import com.p2082ss.android.ugc.aweme.story.p4047g.p4052c.p4053a.C77268b;
import com.p2082ss.android.ugc.aweme.utils.C80249bj;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.h */
public final class C73218h {

    /* renamed from: a */
    public final C73271u f164436a;

    /* renamed from: b */
    public final RecyclerView f164437b;

    /* renamed from: c */
    public AbstractC73257o f164438c;

    /* renamed from: d */
    final InputMethodManager f164439d;

    /* renamed from: e */
    public final C77268b f164440e;

    /* renamed from: f */
    TextView f164441f;

    /* renamed from: g */
    public EditCaptionScene.C73174f f164442g;

    /* renamed from: h */
    public final C73289v f164443h;

    /* renamed from: i */
    public String f164444i = "";

    /* renamed from: j */
    public boolean f164445j;

    /* renamed from: k */
    public int f164446k;

    /* renamed from: l */
    final ArrayList<C75313h> f164447l = new ArrayList<>();

    /* renamed from: m */
    public boolean f164448m;

    /* renamed from: n */
    public final LinearLayout f164449n;

    /* renamed from: o */
    public final ViewGroup f164450o;

    /* renamed from: p */
    public final EditCaptionScene f164451p;

    /* renamed from: q */
    private final AbstractC89244h f164452q = C89250i.m154773a((AbstractC89171a) new C73221a(this));

    /* renamed from: r */
    private final ArrayList<C75313h> f164453r = new ArrayList<>();

    static {
        Covode.recordClassIndex(85936);
    }

    /* renamed from: a */
    public final ActivityC0945e mo115756a() {
        return (ActivityC0945e) this.f164452q.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.h$a */
    static final class C73221a extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ C73218h f164456a;

        static {
            Covode.recordClassIndex(85939);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73221a(C73218h hVar) {
            super(0);
            this.f164456a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ActivityC0945e invoke() {
            Activity t = this.f164456a.f164451p.mo36486t();
            Objects.requireNonNull(t, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            return t;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.h$c */
    public static final class C73223c extends C40903b {

        /* renamed from: a */
        final /* synthetic */ C73218h f164458a;

        static {
            Covode.recordClassIndex(85941);
        }

        @Override // com.p2082ss.android.ugc.aweme.p2724cz.C40903b, com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c
        /* renamed from: b */
        public final void mo70106b() {
            this.f164458a.f164439d.toggleSoftInput(0, 2);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C73223c(C73218h hVar) {
            this.f164458a = hVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo115761b() {
        if (!this.f164436a.f164543f.equals(this.f164453r)) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.h$e */
    public static final class C73226e extends C40903b {

        /* renamed from: a */
        final /* synthetic */ C73218h f164462a;

        static {
            Covode.recordClassIndex(85944);
        }

        @Override // com.p2082ss.android.ugc.aweme.p2724cz.C40903b, com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c
        /* renamed from: c */
        public final void mo70108c() {
        }

        @Override // com.p2082ss.android.ugc.aweme.p2724cz.C40903b, com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c
        /* renamed from: d */
        public final void mo70109d() {
            this.f164462a.f164445j = false;
            this.f164462a.f164440e.mo120870a();
            AbstractC73257o oVar = this.f164462a.f164438c;
            if (oVar != null) {
                oVar.mo115711d(this.f164462a.f164446k);
            }
            if (this.f164462a.f164442g != null) {
                RecyclerView recyclerView = this.f164462a.f164437b;
                EditCaptionScene.C73174f fVar = this.f164462a.f164442g;
                if (fVar == null) {
                    C89219l.m154715b();
                }
                recyclerView.mo4425c(fVar);
                this.f164462a.f164442g = null;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C73226e(C73218h hVar) {
            this.f164462a = hVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.h$d */
    public static final class C73224d implements C77268b.AbstractC77269a {

        /* renamed from: a */
        final /* synthetic */ C73218h f164459a;

        /* renamed from: b */
        final /* synthetic */ C73289v f164460b;

        static {
            Covode.recordClassIndex(85942);
        }

        @Override // com.p2082ss.android.ugc.aweme.story.p4047g.p4052c.p4053a.C77268b.AbstractC77269a
        /* renamed from: a */
        public final void mo77523a(int i) {
        }

        @Override // com.p2082ss.android.ugc.aweme.story.p4047g.p4052c.p4053a.C77268b.AbstractC77269a
        /* renamed from: c */
        public final void mo77540c(int i) {
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.h$d$a */
        public static final class C73225a extends C40903b {

            /* renamed from: a */
            final /* synthetic */ C73224d f164461a;

            static {
                Covode.recordClassIndex(85943);
            }

            @Override // com.p2082ss.android.ugc.aweme.p2724cz.C40903b, com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c
            /* renamed from: c */
            public final void mo70108c() {
            }

            @Override // com.p2082ss.android.ugc.aweme.p2724cz.C40903b, com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c
            /* renamed from: d */
            public final void mo70109d() {
                this.f164461a.f164459a.f164445j = false;
                this.f164461a.f164459a.f164440e.mo120870a();
                AbstractC73257o oVar = this.f164461a.f164459a.f164438c;
                if (oVar != null) {
                    oVar.mo115711d(this.f164461a.f164459a.f164446k);
                }
                if (this.f164461a.f164459a.f164442g != null) {
                    RecyclerView recyclerView = this.f164461a.f164459a.f164437b;
                    EditCaptionScene.C73174f fVar = this.f164461a.f164459a.f164442g;
                    if (fVar == null) {
                        C89219l.m154715b();
                    }
                    recyclerView.mo4425c(fVar);
                    this.f164461a.f164459a.f164442g = null;
                }
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C73225a(C73224d dVar) {
                this.f164461a = dVar;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.story.p4047g.p4052c.p4053a.C77268b.AbstractC77269a
        /* renamed from: b */
        public final void mo77535b(int i) {
            this.f164460b.mo70112b(new C73225a(this));
            this.f164459a.f164448m = false;
        }

        C73224d(C73218h hVar, C73289v vVar) {
            this.f164459a = hVar;
            this.f164460b = vVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.h$b */
    public static final class C73222b implements C77268b.AbstractC77269a {

        /* renamed from: a */
        final /* synthetic */ C73218h f164457a;

        static {
            Covode.recordClassIndex(85940);
        }

        @Override // com.p2082ss.android.ugc.aweme.story.p4047g.p4052c.p4053a.C77268b.AbstractC77269a
        /* renamed from: c */
        public final void mo77540c(int i) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C73222b(C73218h hVar) {
            this.f164457a = hVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.story.p4047g.p4052c.p4053a.C77268b.AbstractC77269a
        /* renamed from: b */
        public final void mo77535b(int i) {
            if (this.f164457a.f164442g != null) {
                RecyclerView recyclerView = this.f164457a.f164437b;
                EditCaptionScene.C73174f fVar = this.f164457a.f164442g;
                if (fVar == null) {
                    C89219l.m154715b();
                }
                recyclerView.mo4425c(fVar);
                this.f164457a.f164442g = null;
            }
            this.f164457a.f164448m = false;
        }

        @Override // com.p2082ss.android.ugc.aweme.story.p4047g.p4052c.p4053a.C77268b.AbstractC77269a
        /* renamed from: a */
        public final void mo77523a(int i) {
            if (this.f164457a.f164442g == null) {
                this.f164457a.f164442g = new EditCaptionScene.C73174f(0, i);
                RecyclerView recyclerView = this.f164457a.f164437b;
                EditCaptionScene.C73174f fVar = this.f164457a.f164442g;
                if (fVar == null) {
                    C89219l.m154715b();
                }
                recyclerView.mo4402a(fVar);
                RecyclerView.AbstractC1362i layoutManager = this.f164457a.f164437b.getLayoutManager();
                Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                ((LinearLayoutManager) layoutManager).mo4347a(this.f164457a.f164436a.f164544g, (int) C13628n.m24520b(this.f164457a.mo115756a(), 100.0f));
            }
            this.f164457a.f164448m = true;
        }
    }

    /* renamed from: a */
    public final void mo115759a(String str) {
        C89219l.m154721d(str, "");
        this.f164444i = str;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.h$f */
    static final class C73227f extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C73218h f164463a;

        static {
            Covode.recordClassIndex(85945);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73227f(C73218h hVar) {
            super(1);
            this.f164463a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37420c(R.string.wz, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.subtitle.C73218h.C73227f.C732281 */

                /* renamed from: a */
                final /* synthetic */ C73227f f164464a;

                static {
                    Covode.recordClassIndex(85946);
                }

                {
                    this.f164464a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    this.f164464a.f164463a.mo115758a(this.f164464a.f164463a.f164443h);
                    return C89391z.f203057a;
                }
            });
            bVar2.mo37418b(R.string.b79, (AbstractC89172b<? super C23024a, C89391z>) null);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo115757a(EditText editText) {
        C89219l.m154721d(editText, "");
        this.f164439d.showSoftInput(editText, 1);
    }

    /* renamed from: a */
    public final void mo115758a(C73289v vVar) {
        if (this.f164448m) {
            this.f164440e.mo120871a(new C73224d(this, vVar));
            View currentFocus = mo115756a().getCurrentFocus();
            if (currentFocus != null) {
                this.f164439d.hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
            }
        } else {
            vVar.mo70112b(new C73226e(this));
        }
        this.f164436a.mo115782a();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.h$g */
    static final class DialogInterface$OnClickListenerC73229g implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C73218h f164465a;

        static {
            Covode.recordClassIndex(85947);
        }

        DialogInterface$OnClickListenerC73229g(C73218h hVar) {
            this.f164465a = hVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C73218h hVar = this.f164465a;
            hVar.mo115758a(hVar.f164443h);
        }
    }

    /* renamed from: a */
    private static Object m129268a(ActivityC0945e eVar, String str) {
        Object obj;
        MethodCollector.m26663i(11547);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = eVar.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = eVar.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = eVar.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(11547);
                }
            }
        } else {
            obj = eVar.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    public final void mo115760a(ArrayList<C75313h> arrayList, int i, int i2, int i3) {
        C89219l.m154721d(arrayList, "");
        this.f164446k = i3;
        this.f164445j = true;
        this.f164453r.clear();
        this.f164453r.addAll(arrayList);
        this.f164447l.clear();
        Iterator<C75313h> it = arrayList.iterator();
        while (it.hasNext()) {
            C75313h next = it.next();
            ArrayList<C75313h> arrayList2 = this.f164447l;
            C89219l.m154716b(next, "");
            arrayList2.add(new C75313h(next));
        }
        C73271u uVar = this.f164436a;
        String str = this.f164444i;
        C89219l.m154721d(str, "");
        uVar.f164539b = str;
        C73271u uVar2 = this.f164436a;
        ArrayList<C75313h> arrayList3 = this.f164447l;
        C89219l.m154721d(arrayList3, "");
        uVar2.f164543f = arrayList3;
        uVar2.f164544g = i;
        uVar2.f164547j = i2;
        uVar2.notifyDataSetChanged();
        RecyclerView.AbstractC1362i layoutManager = this.f164437b.getLayoutManager();
        Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        ((LinearLayoutManager) layoutManager).mo4347a(i, (int) C13628n.m24520b(mo115756a(), 100.0f));
        this.f164440e.mo120871a(new C73222b(this));
        this.f164443h.mo115798c(new C73223c(this));
    }

    public C73218h(LinearLayout linearLayout, ViewGroup viewGroup, EditCaptionScene editCaptionScene, VideoPublishEditModel videoPublishEditModel, AbstractC72510a aVar) {
        TextView textView;
        C89219l.m154721d(linearLayout, "");
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(editCaptionScene, "");
        C89219l.m154721d(videoPublishEditModel, "");
        C89219l.m154721d(aVar, "");
        this.f164449n = linearLayout;
        this.f164450o = viewGroup;
        this.f164451p = editCaptionScene;
        Object a = m129268a(mo115756a(), "input_method");
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        this.f164439d = (InputMethodManager) a;
        C73271u uVar = new C73271u(this, videoPublishEditModel, aVar);
        this.f164436a = uVar;
        View findViewById = linearLayout.findViewById(R.id.as9);
        RecyclerView recyclerView = (RecyclerView) findViewById;
        linearLayout.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.setAdapter(uVar);
        recyclerView.mo4415b(new EditCaptionScene.C73174f((int) C13628n.m24520b(recyclerView.getContext(), 0.0f), (int) C13628n.m24520b(recyclerView.getContext(), 40.0f)));
        recyclerView.setItemAnimator(null);
        C89219l.m154716b(findViewById, "");
        this.f164437b = recyclerView;
        this.f164441f = (TextView) linearLayout.findViewById(R.id.a0w);
        if (C65438du.m117156a() && (textView = this.f164441f) != null) {
            textView.setText(R.string.biv);
        }
        this.f164443h = new C73289v(viewGroup, viewGroup.findViewById(R.id.ebc), linearLayout);
        TextView textView2 = this.f164441f;
        if (textView2 == null) {
            C89219l.m154715b();
        }
        textView2.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.subtitle.C73218h.View$OnClickListenerC732191 */

            /* renamed from: a */
            final /* synthetic */ C73218h f164454a;

            static {
                Covode.recordClassIndex(85937);
            }

            {
                this.f164454a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                C73218h hVar = this.f164454a;
                if (!hVar.mo115761b()) {
                    hVar.mo115758a(hVar.f164443h);
                } else if (C65438du.m117156a()) {
                    Activity t = hVar.f164451p.mo36486t();
                    C89219l.m154716b(t, "");
                    C23028c.m43435a((C23023b) new C23023b(t).mo37483b(R.string.x2), new C73227f(hVar)).mo37405a().mo37396b().show();
                } else {
                    new C17197a.C17200a(hVar.f164451p.mo36486t()).mo27194b(R.string.x2).mo27195b(R.string.a8y, (DialogInterface.OnClickListener) null, false).mo27190a(R.string.wz, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC73229g(hVar), false).mo27193a().mo27184b().show();
                }
            }
        });
        ((TextView) linearLayout.findViewById(R.id.ec3)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.subtitle.C73218h.View$OnClickListenerC732202 */

            /* renamed from: a */
            final /* synthetic */ C73218h f164455a;

            static {
                Covode.recordClassIndex(85938);
            }

            {
                this.f164455a = r1;
            }

            public final void onClick(View view) {
                long startTime;
                ClickAgent.onClick(view);
                C73218h hVar = this.f164455a;
                C73271u uVar = hVar.f164436a;
                if (uVar.f164544g == -1) {
                    startTime = uVar.f164543f.get(0).getStartTime();
                } else {
                    startTime = uVar.f164543f.get(uVar.f164544g).getStartTime();
                }
                hVar.f164446k = (int) startTime;
                AbstractC73257o oVar = hVar.f164438c;
                if (oVar != null) {
                    oVar.mo115707a(hVar.mo115761b(), hVar.f164436a.f164544g, hVar.f164447l);
                }
                hVar.mo115758a(hVar.f164443h);
            }
        });
        ActivityC0945e a2 = mo115756a();
        C89219l.m154721d(a2, "");
        this.f164440e = new C77268b(a2, C80249bj.f179731a);
    }
}
