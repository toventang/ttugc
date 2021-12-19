package com.p2082ss.android.ugc.aweme.i18n.xbridge.p3068d.p3069a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import androidx.core.content.C0643b;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.xbridge.base.runtime.p1292a.C18423d;
import com.bytedance.ies.xbridge.base.runtime.p1292a.C18424e;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.i18n.xbridge.p3064a.AbstractC53515a;
import com.p2082ss.android.ugc.aweme.i18n.xbridge.p3064a.AbstractC53516b;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2440ce.C35444b;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import com.p2082ss.android.ugc.aweme.p2929fe.method.ImageChooseActivity;
import com.p2082ss.android.ugc.aweme.p2929fe.p2930a.C47806b;
import com.p2082ss.android.ugc.aweme.profile.C63419ae;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80313cs;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import p077b.C1731i;
import p077b.C1743j;
import p078c.p083d.C1762a;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.d.a.a */
public final class C53558a implements AbstractC53515a {

    /* renamed from: c */
    public static final C53559a f122920c = new C53559a((byte) 0);

    /* renamed from: a */
    public final AbstractC53516b f122921a;

    /* renamed from: b */
    public boolean f122922b;

    /* renamed from: d */
    private final WeakReference<Activity> f122923d;

    /* renamed from: e */
    private int f122924e = 1;

    /* renamed from: f */
    private boolean f122925f;

    /* renamed from: g */
    private String f122926g = "";

    /* renamed from: h */
    private boolean f122927h = true;

    /* renamed from: i */
    private String f122928i = "";

    /* renamed from: j */
    private boolean f122929j = true;

    /* renamed from: k */
    private boolean f122930k;

    /* renamed from: l */
    private int f122931l;

    /* renamed from: m */
    private int f122932m;

    /* renamed from: n */
    private float f122933n = 1.0f;

    /* renamed from: o */
    private final ExecutorService f122934o;

    static {
        Covode.recordClassIndex(63134);
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.d.a.a$a */
    public static final class C53559a {
        static {
            Covode.recordClassIndex(63135);
        }

        private C53559a() {
        }

        public /* synthetic */ C53559a(byte b) {
            this();
        }

        /* renamed from: a */
        public static String m98774a(Context context, String str) {
            String a = C1762a.m5918a(context, Uri.parse(str));
            if (a == null) {
                a = "";
            }
            try {
                String b = C80313cs.m139233b(a);
                C89219l.m154716b(b, "");
                return b;
            } catch (IOException unused) {
                return "";
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.d.a.a$b */
    public static final class RunnableC53560b implements Runnable {

        /* renamed from: a */
        public final Activity f122935a;

        /* renamed from: b */
        public final List<String> f122936b;

        /* renamed from: c */
        public final AbstractC89172b<List<String>, C89391z> f122937c;

        /* renamed from: d */
        private final WeakReference<AbstractC53516b> f122938d;

        static {
            Covode.recordClassIndex(63136);
        }

        public final void run() {
            C1731i<List<String>> a = m98775a(this.f122936b);
            try {
                a.mo5547f();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            List<String> d = a.mo5545d();
            AbstractC89172b<List<String>, C89391z> bVar = this.f122937c;
            C89219l.m154716b(d, "");
            bVar.invoke(d);
        }

        /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.d.a.a$b$a */
        public static final class C53561a implements IAVProcessService.IProcessCallback<String> {

            /* renamed from: a */
            final /* synthetic */ IAVProcessService f122939a;

            /* renamed from: b */
            final /* synthetic */ ArrayList f122940b;

            /* renamed from: c */
            final /* synthetic */ List f122941c;

            /* renamed from: d */
            final /* synthetic */ C1743j f122942d;

            static {
                Covode.recordClassIndex(63137);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVProcessService.IProcessCallback
            public final /* synthetic */ void finish(String str) {
                this.f122940b.add(str);
                if (this.f122940b.size() == this.f122941c.size()) {
                    this.f122942d.mo5555a(this.f122940b);
                }
            }

            C53561a(IAVProcessService iAVProcessService, ArrayList arrayList, List list, C1743j jVar) {
                this.f122939a = iAVProcessService;
                this.f122940b = arrayList;
                this.f122941c = list;
                this.f122942d = jVar;
            }
        }

        /* renamed from: a */
        private static C1731i<List<String>> m98775a(List<String> list) {
            C1743j jVar = new C1743j();
            try {
                IAVProcessService processService = AVExternalServiceImpl.m113114a().abilityService().processService();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    processService.compressPhoto(it.next(), 216, 384, new C53561a(processService, arrayList, list, jVar));
                }
            } catch (Exception e) {
                e.printStackTrace();
                jVar.mo5555a((Object) null);
            }
            C1731i<TResult> iVar = jVar.f5610a;
            C89219l.m154716b(iVar, "");
            return iVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.b<? super java.util.List<java.lang.String>, h.z> */
        /* JADX WARN: Multi-variable type inference failed */
        public RunnableC53560b(Activity activity, List<String> list, AbstractC53516b bVar, AbstractC89172b<? super List<String>, C89391z> bVar2) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(list, "");
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(bVar2, "");
            this.f122935a = activity;
            this.f122936b = list;
            this.f122937c = bVar2;
            this.f122938d = new WeakReference<>(bVar);
        }
    }

    /* renamed from: b */
    public static void m98770b(Activity activity) {
        if (!(!C89219l.m154714a((Object) "mounted", (Object) Environment.getExternalStorageState()))) {
            Intent intent = new Intent();
            intent.setType("image/*");
            intent.setAction("android.intent.action.PICK");
            activity.startActivityForResult(intent, 10003);
        }
    }

    /* renamed from: a */
    public final void mo90119a(Activity activity) {
        Intent intent = new Intent(activity, ImageChooseActivity.class);
        intent.putExtra("maxSelectNum", this.f122924e);
        intent.putExtra("enter_from", this.f122928i);
        activity.startActivityForResult(intent, 10003);
        C39162r.m79460a("enter_image_choose", new C33744d().mo59983a("enter_from", this.f122928i).f79943a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.d.a.a$c */
    public static final class C53562c extends AbstractC89220m implements AbstractC89172b<List<? extends String>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C53558a f122943a;

        /* renamed from: b */
        final /* synthetic */ Activity f122944b;

        static {
            Covode.recordClassIndex(63138);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53562c(C53558a aVar, Activity activity) {
            super(1);
            this.f122943a = aVar;
            this.f122944b = activity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends String> list) {
            C18424e.C18425a aVar;
            List<? extends String> list2 = list;
            C89219l.m154721d(list2, "");
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list2, 10));
            for (T t : list2) {
                if (t == null) {
                    aVar = new C18424e.C18425a("", 0, "image");
                    if (this.f122943a.f122922b) {
                        aVar.f44027a = "";
                    }
                } else {
                    aVar = new C18424e.C18425a(t, new File((String) t).length(), "image");
                    if (this.f122943a.f122922b) {
                        aVar.f44027a = C53559a.m98774a(this.f122944b, t);
                    }
                }
                arrayList.add(aVar);
            }
            final ArrayList arrayList2 = arrayList;
            this.f122944b.runOnUiThread(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.i18n.xbridge.p3068d.p3069a.C53558a.C53562c.RunnableC535631 */

                /* renamed from: a */
                final /* synthetic */ C53562c f122945a;

                static {
                    Covode.recordClassIndex(63139);
                }

                {
                    this.f122945a = r1;
                }

                public final void run() {
                    AbstractC53516b bVar = this.f122945a.f122943a.f122921a;
                    C18424e eVar = new C18424e();
                    eVar.f44026a = arrayList2;
                    bVar.mo90107a(eVar);
                }
            });
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.i18n.xbridge.p3064a.AbstractC53515a
    /* renamed from: a */
    public final void mo90104a(C18423d dVar) {
        boolean z;
        C89219l.m154721d(dVar, "");
        this.f122924e = dVar.f44019g;
        boolean z2 = false;
        if (dVar.f44020h || dVar.f44016d) {
            z = true;
        } else {
            z = false;
        }
        this.f122925f = z;
        this.f122930k = dVar.f44013a;
        this.f122932m = dVar.f44015c;
        int i = dVar.f44014b;
        this.f122931l = i;
        int i2 = this.f122932m;
        if (i2 * i != 0) {
            this.f122933n = (((float) i2) * 1.0f) / ((float) i);
        }
        if (this.f122924e > 1) {
            z2 = true;
        }
        this.f122927h = z2;
        this.f122922b = dVar.f44016d;
        if (this.f122927h) {
            Activity activity = this.f122923d.get();
            Objects.requireNonNull(activity, "null cannot be cast to non-null type android.app.Activity");
            Activity activity2 = activity;
            if (C0643b.m2367a(activity2, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                mo90119a(activity2);
            } else {
                C35444b.m72473a(activity2, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C53565e(this, activity2));
            }
        } else {
            Activity activity3 = this.f122923d.get();
            Objects.requireNonNull(activity3, "null cannot be cast to non-null type android.app.Activity");
            Activity activity4 = activity3;
            if (C0643b.m2367a(activity4, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                m98770b(activity4);
            } else {
                C35444b.m72473a(activity4, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C53564d(this, activity4));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.d.a.a$d */
    static final class C53564d implements C35444b.AbstractC35447b {

        /* renamed from: a */
        final /* synthetic */ C53558a f122947a;

        /* renamed from: b */
        final /* synthetic */ Activity f122948b;

        static {
            Covode.recordClassIndex(63140);
        }

        C53564d(C53558a aVar, Activity activity) {
            this.f122947a = aVar;
            this.f122948b = activity;
        }

        @Override // com.p2082ss.android.ugc.aweme.p2440ce.C35444b.AbstractC35447b
        /* renamed from: a */
        public final void mo53515a(String[] strArr, int[] iArr) {
            C89219l.m154716b(iArr, "");
            if (iArr.length != 0) {
                if (iArr[0] == 0) {
                    C53558a.m98770b(this.f122948b);
                } else {
                    this.f122947a.f122921a.mo90106a(-6, "Permission rejected");
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.d.a.a$e */
    static final class C53565e implements C35444b.AbstractC35447b {

        /* renamed from: a */
        final /* synthetic */ C53558a f122949a;

        /* renamed from: b */
        final /* synthetic */ Activity f122950b;

        static {
            Covode.recordClassIndex(63141);
        }

        C53565e(C53558a aVar, Activity activity) {
            this.f122949a = aVar;
            this.f122950b = activity;
        }

        @Override // com.p2082ss.android.ugc.aweme.p2440ce.C35444b.AbstractC35447b
        /* renamed from: a */
        public final void mo53515a(String[] strArr, int[] iArr) {
            C89219l.m154716b(iArr, "");
            if (iArr.length != 0) {
                if (iArr[0] == 0) {
                    this.f122949a.mo90119a(this.f122950b);
                    return;
                }
                new C79459a(this.f122950b).mo123052a(this.f122950b.getString(R.string.dng)).mo123053a();
                this.f122949a.f122921a.mo90106a(-1, "no permission");
            }
        }
    }

    public C53558a(WeakReference<Activity> weakReference, AbstractC53516b bVar) {
        C89219l.m154721d(weakReference, "");
        C89219l.m154721d(bVar, "");
        this.f122923d = weakReference;
        this.f122921a = bVar;
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.SERIAL);
        a.f95504b = "compressPhoto";
        this.f122934o = C40780g.m82242a(a.mo70028a());
    }

    /* renamed from: a */
    private void m98769a(Activity activity, List<? extends Uri> list) {
        long j;
        C89219l.m154721d(activity, "");
        C89219l.m154721d(list, "");
        if (list.isEmpty()) {
            this.f122921a.mo90106a(0, "Path empty");
        } else {
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (C13627m.m24498a(it.next().toString())) {
                    }
                }
            }
            if (this.f122925f) {
                ExecutorService executorService = this.f122934o;
                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    String uri = it2.next().toString();
                    C89219l.m154716b(uri, "");
                    arrayList.add(uri);
                }
                executorService.execute(new RunnableC53560b(activity, arrayList, this.f122921a, new C53562c(this, activity)));
                return;
            }
            ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) list, 10));
            for (T t : list) {
                Long a = C47806b.m90821a(C17867d.m33078a(), t);
                if (a != null) {
                    j = a.longValue();
                } else {
                    j = 0;
                }
                String uri2 = t.toString();
                C89219l.m154716b(uri2, "");
                arrayList2.add(new C18424e.C18425a(uri2, j, "image"));
            }
            AbstractC53516b bVar = this.f122921a;
            C18424e eVar = new C18424e();
            eVar.f44026a = arrayList2;
            bVar.mo90107a(eVar);
            return;
        }
        this.f122921a.mo90106a(0, "Path empty");
    }

    @Override // com.p2082ss.android.ugc.aweme.i18n.xbridge.p3064a.AbstractC53515a
    /* renamed from: a */
    public final boolean mo90105a(int i, int i2, Intent intent) {
        ArrayList arrayList;
        if (i2 == 0 || intent == null) {
            this.f122921a.mo90106a(-7, "User cancelled");
            return true;
        }
        Activity activity = this.f122923d.get();
        if (activity == null) {
            this.f122921a.mo90106a(0, "Activity not found");
            return true;
        } else if (this.f122930k) {
            Uri data = intent.getData();
            if (data == null || C13627m.m24498a(data.toString())) {
                this.f122921a.mo90106a(0, "Path empty");
                return true;
            }
            String uri = data.toString();
            C89219l.m154716b(uri, "");
            if (i == 10003) {
                C63419ae.f143971a.gotoCropActivity(activity, uri, false, this.f122933n, (int) C13628n.m24520b(activity, 16.0f), 10004, 0, 0, -1, false);
            } else if (i == 10004) {
                m98769a(activity, C89070n.m154516a(data));
            }
            return true;
        } else {
            if (i2 == 41312) {
                String[] stringArrayExtra = intent.getStringArrayExtra("images");
                if (stringArrayExtra != null) {
                    ArrayList arrayList2 = new ArrayList(stringArrayExtra.length);
                    for (String str : stringArrayExtra) {
                        arrayList2.add(Uri.parse(str));
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = new ArrayList();
                }
            } else {
                arrayList = C89070n.m154525d(intent.getData());
            }
            m98769a(activity, arrayList);
            return true;
        }
    }
}
