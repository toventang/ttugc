package com.p2082ss.android.ugc.aweme.share.improve.p3755a;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.bpea.basics.C13340a;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.entry.p873a.p874a.C13386a;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.share.C68857ad;
import com.p2082ss.android.ugc.aweme.share.ShareFlavorService;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.p3783a.C69659a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.views.DialogC81438i;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.Objects;
import java.util.concurrent.Callable;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4573e.p4579f.C88801b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.c */
public class C69037c implements AbstractC69693h {

    /* renamed from: b */
    public static final C69038a f154417b = new C69038a((byte) 0);

    /* renamed from: a */
    final boolean f154418a;

    /* renamed from: c */
    private final String f154419c;

    /* renamed from: d */
    private final boolean f154420d;

    static {
        Covode.recordClassIndex(81351);
    }

    public C69037c() {
        this(null, false, 7);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: b */
    public final int mo61918b() {
        return R.string.fq2;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: c */
    public final String mo61919c() {
        return "copy";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    public final int co_() {
        return R.raw.icon_2pt_link;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: d */
    public final boolean mo61921d() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: e */
    public final boolean mo61922e() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: f */
    public boolean mo61923f() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.c$a */
    public static final class C69038a {
        static {
            Covode.recordClassIndex(81352);
        }

        private C69038a() {
        }

        public /* synthetic */ C69038a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.c$d */
    static final class C69041d extends AbstractC89220m implements AbstractC89171a<DialogC81438i> {

        /* renamed from: a */
        final /* synthetic */ Context f154428a;

        static {
            Covode.recordClassIndex(81355);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69041d(Context context) {
            super(0);
            this.f154428a = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DialogC81438i invoke() {
            return new DialogC81438i(this.f154428a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: g */
    public final int mo61924g() {
        return co_();
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.c$b */
    static final class CallableC69039b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ SharePackage f154421a;

        /* renamed from: b */
        final /* synthetic */ String f154422b;

        static {
            Covode.recordClassIndex(81353);
        }

        CallableC69039b(SharePackage sharePackage, String str) {
            this.f154421a = sharePackage;
            this.f154422b = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            SharePackage sharePackage = this.f154421a;
            String str = this.f154422b;
            if (sharePackage != null) {
                String a = C68857ad.m121524a(sharePackage.f155491h, str);
                if (!C80580in.m139687c()) {
                    String str2 = sharePackage.f155487d;
                    sharePackage.f155492i.getBoolean("bool_persist");
                    a = C68857ad.m121525a(str2, str, a);
                }
                if (a == null) {
                    return "";
                }
                return a;
            }
            return "";
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61914a(Context context) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(context, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61916a(ImageView imageView) {
        C89219l.m154721d(imageView, "");
        C89219l.m154721d(imageView, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61917a(TextView textView) {
        C89219l.m154721d(textView, "");
        AbstractC69693h.C69694a.m123110a(this, textView);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.c$c */
    static final class C69040c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C69037c f154423a;

        /* renamed from: b */
        final /* synthetic */ SharePackage f154424b;

        /* renamed from: c */
        final /* synthetic */ Context f154425c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89244h f154426d;

        /* renamed from: e */
        final /* synthetic */ AbstractC89286i f154427e = null;

        static {
            Covode.recordClassIndex(81354);
        }

        C69040c(C69037c cVar, SharePackage sharePackage, Context context, AbstractC89244h hVar) {
            this.f154423a = cVar;
            this.f154424b = sharePackage;
            this.f154425c = context;
            this.f154426d = hVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            ShareFlavorService a = ShareFlavorService.C68825a.m121371a();
            C89219l.m154716b(str, "");
            String a2 = a.mo109370a(str, this.f154424b);
            C69037c cVar = this.f154423a;
            Context context = this.f154425c;
            C89219l.m154721d(a2, "");
            C89219l.m154721d(context, "");
            Object a3 = C69037c.m121959a(context, "clipboard");
            Objects.requireNonNull(a3, "null cannot be cast to non-null type android.content.ClipboardManager");
            ClipboardManager clipboardManager = (ClipboardManager) a3;
            ClipData newPlainText = ClipData.newPlainText(a2, a2);
            try {
                C89219l.m154716b(newPlainText, "");
                C13386a.C13387a.m24072a(clipboardManager, newPlainText, PrivacyCert.Builder.Companion.with("bpea-228").usage("").tag("BaseCopyAction_copyToClipboard").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build());
                if (cVar.f154418a) {
                    new C79459a(context).mo123050a(R.string.au9).mo123053a();
                }
            } catch (C13340a e) {
                C51423a.m95786a((Exception) e);
            }
            if (C69659a.m123052a()) {
                ((DialogC81438i) this.f154426d.getValue()).dismiss();
            }
        }
    }

    public C69037c(String str, boolean z) {
        C89219l.m154721d(str, "");
        this.f154419c = str;
        this.f154420d = false;
        this.f154418a = z;
    }

    /* renamed from: a */
    static Object m121959a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(9165);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
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
                    MethodCollector.m26664o(9165);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public void mo61915a(Context context, SharePackage sharePackage) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(sharePackage, "");
        String a = ShareFlavorService.C68825a.m121371a().mo109369a();
        AbstractC89244h a2 = C89250i.m154773a((AbstractC89171a) new C69041d(context));
        if (C69659a.m123052a()) {
            ((DialogC81438i) a2.getValue()).show();
        }
        AbstractC88403ab b = AbstractC88403ab.m153604a((Callable) new CallableC69039b(sharePackage, a)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142918b(C88925a.m154180b(C88946a.f201991c));
        C69040c cVar = new C69040c(this, sharePackage, context, a2);
        C88466b.m153697a((Object) cVar, "doAfterSuccess is null");
        C88925a.m154163a(new C88801b(b, cVar)).mo142926c();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C69037c(String str, boolean z, int i) {
        this((i & 1) != 0 ? "" : str, (i & 4) != 0 ? true : z);
    }

    /* renamed from: a */
    public final void mo109523a(String str, Context context, PrivacyCert privacyCert) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(context, "");
        Object a = m121959a(context, "clipboard");
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipboardManager clipboardManager = (ClipboardManager) a;
        ClipData newPlainText = ClipData.newPlainText(str, str);
        try {
            C89219l.m154716b(newPlainText, "");
            C13386a.C13387a.m24072a(clipboardManager, newPlainText, privacyCert);
            if (this.f154418a) {
                new C79459a(context).mo123050a(R.string.au9).mo123053a();
            }
        } catch (C13340a e) {
            C51423a.m95786a((Exception) e);
        }
    }
}
