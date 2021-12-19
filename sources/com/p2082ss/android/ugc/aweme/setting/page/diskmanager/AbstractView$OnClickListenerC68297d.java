package com.p2082ss.android.ugc.aweme.setting.page.diskmanager;

import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1733u.AbstractC23430a;
import com.bytedance.p1733u.C23435d;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p2386be.C34796d;
import com.p2082ss.android.ugc.aweme.p2727db.C40934c;
import com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.page.diskmanager.d */
public abstract class AbstractView$OnClickListenerC68297d extends C40934c implements View.OnClickListener {

    /* renamed from: b */
    public static final C68298a f152869b = new C68298a((byte) 0);

    /* renamed from: a */
    public final AbstractC68195a f152870a;

    /* renamed from: c */
    private final AbstractC89244h f152871c = C89250i.m154773a((AbstractC89171a) new C68299b(this));

    /* renamed from: d */
    private final AbstractC89244h f152872d = C89250i.m154773a((AbstractC89171a) new C68309j(this));

    /* renamed from: e */
    private final AbstractC89244h f152873e = C89250i.m154773a((AbstractC89171a) new C68301d(this));

    /* renamed from: f */
    private final AbstractC89244h f152874f = C89250i.m154773a((AbstractC89171a) new C68303f(this));

    static {
        Covode.recordClassIndex(80511);
    }

    /* renamed from: a */
    public abstract void mo108765a(View view);

    /* renamed from: f */
    public abstract void mo108767f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final ActivityC0945e mo108773g() {
        return (ActivityC0945e) this.f152871c.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final DiskViewModel mo108774h() {
        return (DiskViewModel) this.f152872d.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final View mo108775i() {
        return (View) this.f152873e.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final TuxTextView mo108776j() {
        return (TuxTextView) this.f152874f.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.diskmanager.d$a */
    public static final class C68298a {
        static {
            Covode.recordClassIndex(80512);
        }

        private C68298a() {
        }

        public /* synthetic */ C68298a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.diskmanager.d$b */
    static final class C68299b extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractView$OnClickListenerC68297d f152875a;

        static {
            Covode.recordClassIndex(80513);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68299b(AbstractView$OnClickListenerC68297d dVar) {
            super(0);
            this.f152875a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ActivityC0945e invoke() {
            return this.f152875a.f152870a.requireActivity();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.diskmanager.d$d */
    static final class C68301d extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ AbstractView$OnClickListenerC68297d f152878a;

        static {
            Covode.recordClassIndex(80515);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68301d(AbstractView$OnClickListenerC68297d dVar) {
            super(0);
            this.f152878a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return C1764a.m5927a(LayoutInflater.from(this.f152878a.mo108773g()), R.layout.axu, null, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.diskmanager.d$f */
    static final class C68303f extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ AbstractView$OnClickListenerC68297d f152880a;

        static {
            Covode.recordClassIndex(80517);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68303f(AbstractView$OnClickListenerC68297d dVar) {
            super(0);
            this.f152880a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            ActivityC0945e g = this.f152880a.mo108773g();
            C89219l.m154716b(g, "");
            return new TuxTextView(g, null, 0, 6);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.diskmanager.d$j */
    static final class C68309j extends AbstractC89220m implements AbstractC89171a<DiskViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractView$OnClickListenerC68297d f152888a;

        static {
            Covode.recordClassIndex(80523);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68309j(AbstractView$OnClickListenerC68297d dVar) {
            super(0);
            this.f152888a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DiskViewModel invoke() {
            AbstractC1174ac a = C1181ae.m3879a(this.f152888a.f152870a, (C1175ad.AbstractC1177b) null).mo3983a(DiskViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: e */
    public C34796d mo70131d() {
        C34796d dVar = (C34796d) super.mo70131d();
        C1213t<Boolean> tVar = mo108774h().f152850a;
        if (tVar != null) {
            tVar.observe(this.f152870a, new C68302e(this));
        }
        return dVar;
    }

    /* renamed from: k */
    public final void mo108777k() {
        int b = (int) C13628n.m24520b(mo108773g(), 18.0f);
        int b2 = (int) C13628n.m24520b(mo108773g(), 4.0f);
        mo108776j().setTextSize(12.0f);
        TuxTextView j = mo108776j();
        ActivityC0945e g = mo108773g();
        C89219l.m154716b(g, "");
        j.setTextColor(g.getResources().getColor(R.color.bx));
        mo108776j().setBackgroundResource(R.drawable.bfm);
        mo108776j().setTuxFont(82);
        mo108776j().setPadding(b, b2, b, b2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.setting.page.diskmanager.d$h */
    public static final class C68305h<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractView$OnClickListenerC68297d f152883a;

        static {
            Covode.recordClassIndex(80519);
        }

        C68305h(AbstractView$OnClickListenerC68297d dVar) {
            this.f152883a = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            final String str = (String) obj;
            this.f152883a.mo70126a(new AbstractC89172b<C34796d, C34796d>() {
                /* class com.p2082ss.android.ugc.aweme.setting.page.diskmanager.AbstractView$OnClickListenerC68297d.C68305h.C683061 */

                static {
                    Covode.recordClassIndex(80520);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C34796d invoke(C34796d dVar) {
                    C34796d dVar2 = dVar;
                    String str = "";
                    C89219l.m154721d(dVar2, str);
                    String str2 = str;
                    if (str2 != null) {
                        str = str2;
                    }
                    return C34796d.m71048a(dVar2, str, null, null, null, false, null, null, null, false, null, false, null, false, false, null, false, 0, 122878);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.setting.page.diskmanager.d$i */
    public static final class C68307i<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractView$OnClickListenerC68297d f152885a;

        /* renamed from: b */
        final /* synthetic */ String f152886b;

        static {
            Covode.recordClassIndex(80521);
        }

        C68307i(AbstractView$OnClickListenerC68297d dVar, String str) {
            this.f152885a = dVar;
            this.f152886b = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f152885a.mo70126a(new AbstractC89172b<C34796d, C34796d>(this) {
                /* class com.p2082ss.android.ugc.aweme.setting.page.diskmanager.AbstractView$OnClickListenerC68297d.C68307i.C683081 */

                /* renamed from: a */
                final /* synthetic */ C68307i f152887a;

                static {
                    Covode.recordClassIndex(80522);
                }

                {
                    this.f152887a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C34796d invoke(C34796d dVar) {
                    C34796d dVar2 = dVar;
                    String str = "";
                    C89219l.m154721d(dVar2, str);
                    String b = this.f152887a.f152885a.mo108772b(this.f152887a.f152886b);
                    if (b != null) {
                        str = b;
                    }
                    return C34796d.m71048a(dVar2, str, null, null, null, false, null, null, null, false, null, false, null, false, false, null, false, 0, 122878);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo108770a(int i) {
        mo70126a(new C68300c(this, i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.setting.page.diskmanager.d$e */
    public static final class C68302e<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractView$OnClickListenerC68297d f152879a;

        static {
            Covode.recordClassIndex(80516);
        }

        C68302e(AbstractView$OnClickListenerC68297d dVar) {
            this.f152879a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                this.f152879a.mo108767f();
            }
        }
    }

    public void onClick(View view) {
        ClickAgent.onClick(view);
        C89219l.m154721d(view, "");
        if (!((C34796d) mo70132l()).f82160h) {
            mo108765a(view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.setting.page.diskmanager.d$c */
    public static final class C68300c extends AbstractC89220m implements AbstractC89172b<C34796d, C34796d> {

        /* renamed from: a */
        final /* synthetic */ AbstractView$OnClickListenerC68297d f152876a;

        /* renamed from: b */
        final /* synthetic */ int f152877b;

        static {
            Covode.recordClassIndex(80514);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68300c(AbstractView$OnClickListenerC68297d dVar, int i) {
            super(1);
            this.f152876a = dVar;
            this.f152877b = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C34796d invoke(C34796d dVar) {
            C34796d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            return C34796d.m71048a(dVar2, this.f152876a.mo108768a(this.f152877b, new Object[0]), null, null, null, false, null, null, null, false, null, false, null, false, true, null, false, 0, 122878);
        }
    }

    public AbstractView$OnClickListenerC68297d(AbstractC68195a aVar) {
        C89219l.m154721d(aVar, "");
        this.f152870a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo108771a(String str) {
        C89219l.m154721d(str, "");
        AbstractC88979t.m154310b(this).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143292d(new C68304g(this, str)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C68305h(this), new C68307i(this, str));
    }

    /* renamed from: b */
    public final String mo108772b(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 63879010) {
            if (hashCode == 65307009 && str.equals("DRAFT")) {
                return mo108768a(R.string.fn3, Float.valueOf(0.0f));
            }
        } else if (str.equals("CACHE")) {
            return mo108768a(R.string.fnh, Float.valueOf(0.0f));
        }
        return mo108768a(R.string.fmy, Float.valueOf(0.0f));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.setting.page.diskmanager.d$g */
    public static final class C68304g<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ AbstractView$OnClickListenerC68297d f152881a;

        /* renamed from: b */
        final /* synthetic */ String f152882b;

        static {
            Covode.recordClassIndex(80518);
        }

        C68304g(AbstractView$OnClickListenerC68297d dVar, String str) {
            this.f152881a = dVar;
            this.f152882b = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C89219l.m154721d(obj, "");
            List<AbstractC23430a> b = C23435d.m44118b();
            if (b != null) {
                ArrayList arrayList = new ArrayList();
                for (T t : b) {
                    T t2 = t;
                    if (C89219l.m154714a((Object) this.f152882b, (Object) (t2 != null ? t2.mo38198a() : null))) {
                        arrayList.add(t);
                    }
                }
                ArrayList arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) arrayList2, 10));
                for (T t3 : arrayList2) {
                    C89219l.m154716b(t3, "");
                    long e = t3.mo38202e();
                    double d = (double) e;
                    Double.isNaN(d);
                    StringBuilder append = new StringBuilder("module: ").append(this.f152882b).append(", name = ").append(t3.getClass().getSimpleName()).append(", size = ").append(d / 1048576.0d).append("M, workspace: ");
                    File c = t3.mo38200c();
                    C89219l.m154716b(c, "");
                    C51423a.m95792b("disk-manager", append.append(c.getAbsolutePath()).toString());
                    arrayList3.add(Long.valueOf(e));
                }
                Long valueOf = Long.valueOf(C89070n.m154600t(arrayList3));
                if (valueOf != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("module", this.f152882b);
                    jSONObject.put("size", valueOf.longValue());
                    C34611o.m70668a("disk_manager_module_size", jSONObject);
                    return this.f152881a.mo108769a(this.f152882b, (double) valueOf.longValue());
                }
            }
            return this.f152881a.mo108772b(this.f152882b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo108768a(int i, Object... objArr) {
        C89219l.m154721d(objArr, "");
        String string = mo108773g().getString(i, Arrays.copyOf(objArr, objArr.length));
        C89219l.m154716b(string, "");
        return string;
    }

    /* renamed from: a */
    public final String mo108769a(String str, double d) {
        int hashCode = str.hashCode();
        if (hashCode != 65307009) {
            if (hashCode == 441562126 && str.equals("RESOURCE")) {
                double d2 = d / 1.073741824E9d;
                if (d2 > 1.0d) {
                    return mo108768a(R.string.fmz, Double.valueOf(d2));
                }
                return mo108768a(R.string.fmy, Double.valueOf(d / 1048576.0d));
            }
        } else if (str.equals("DRAFT")) {
            double d3 = d / 1.073741824E9d;
            if (d3 > 1.0d) {
                return mo108768a(R.string.fn4, Double.valueOf(d3));
            }
            return mo108768a(R.string.fn3, Double.valueOf(d / 1048576.0d));
        }
        double d4 = d / 1048576.0d;
        if (d4 < 30.0d) {
            return mo108768a(R.string.fnh, Float.valueOf(0.0f));
        }
        return mo108768a(R.string.fnh, Double.valueOf(d4));
    }
}
