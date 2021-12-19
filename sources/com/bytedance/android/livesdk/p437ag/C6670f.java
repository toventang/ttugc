package com.bytedance.android.livesdk.p437ag;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Build;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.livesdk.p437ag.C6668e;
import com.bytedance.android.livesdk.p437ag.FragmentC6649b;
import com.bytedance.android.livesdk.p437ag.p439b.AbstractC6654b;
import com.bytedance.android.livesdk.p437ag.p439b.AbstractC6655c;
import com.bytedance.android.livesdk.p437ag.p439b.AbstractC6656d;
import com.bytedance.android.livesdk.p437ag.p440c.C6662e;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.bytedance.android.livesdk.ag.f */
public final class C6670f {

    /* renamed from: a */
    private FragmentC6649b f16563a;

    static {
        Covode.recordClassIndex(7408);
    }

    /* renamed from: com.bytedance.android.livesdk.ag.f$a */
    public static abstract class AbstractC6671a implements AbstractC6654b {
        static {
            Covode.recordClassIndex(7409);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract String mo12813a(Activity activity);

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract String mo12814a(Activity activity, String... strArr);

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public String mo12815b(Activity activity) {
            return activity.getString(R.string.gtk);
        }

        @Override // com.bytedance.android.livesdk.p437ag.p439b.AbstractC6654b
        /* renamed from: a */
        public final void mo12804a(Activity activity, AbstractC6655c cVar, String[] strArr) {
            DialogC9148b.C9149a aVar = new DialogC9148b.C9149a(activity);
            aVar.f22244a = mo12813a(activity);
            aVar.f22245b = mo12814a(activity, strArr);
            DialogC9148b.C9149a b = aVar.mo15245a((CharSequence) mo12815b(activity), (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC6675g(this, cVar), false).mo15250b((CharSequence) activity.getString(R.string.gi8), DialogInterface$OnClickListenerC6676h.f16571a, false);
            b.f22259p = DialogInterface$OnKeyListenerC6677i.f16572a;
            b.f22256m = false;
            b.f22260q = new DialogInterface$OnCancelListenerC6678j(this, cVar);
            b.mo15247a().show();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.ag.f$d */
    public static class C6674d extends AbstractC6671a {
        static {
            Covode.recordClassIndex(7412);
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.android.livesdk.p437ag.C6670f.AbstractC6671a
        /* renamed from: a */
        public final String mo12813a(Activity activity) {
            return activity.getString(R.string.gu9);
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.android.livesdk.p437ag.C6670f.AbstractC6671a
        /* renamed from: b */
        public final String mo12815b(Activity activity) {
            return activity.getString(R.string.gvb);
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.android.livesdk.p437ag.C6670f.AbstractC6671a
        /* renamed from: a */
        public final String mo12814a(Activity activity, String... strArr) {
            Object[] objArr = new Object[1];
            ArrayList<Integer> arrayList = new ArrayList();
            for (String str : strArr) {
                if (C6667d.f16560a.containsKey(str)) {
                    Integer num = C6667d.f16560a.get(str);
                    if (!arrayList.contains(num)) {
                        arrayList.add(num);
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            for (Integer num2 : arrayList) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(activity.getString(num2.intValue()));
            }
            objArr[0] = sb.toString();
            return activity.getString(R.string.gu8, objArr);
        }
    }

    /* renamed from: a */
    public static C6672b m14183a(Activity activity) {
        return new C6672b(activity);
    }

    /* renamed from: com.bytedance.android.livesdk.ag.f$b */
    public static class C6672b {

        /* renamed from: a */
        Activity f16564a;

        /* renamed from: b */
        AbstractC6654b f16565b = new C6673c();

        /* renamed from: c */
        AbstractC6654b f16566c = new C6674d();

        /* renamed from: d */
        public Runnable f16567d = RunnableC6679k.f16575a;

        /* renamed from: e */
        Runnable f16568e = RunnableC6680l.f16576a;

        static {
            Covode.recordClassIndex(7410);
        }

        public C6672b(Activity activity) {
            this.f16564a = activity;
        }

        /* renamed from: a */
        public final void mo12816a(AbstractC6656d dVar, String... strArr) {
            Activity activity = this.f16564a;
            if (activity != null && !activity.isFinishing()) {
                try {
                    new C6670f(this.f16564a, (byte) 0).mo12812a(dVar, this.f16567d, this.f16565b, this.f16566c, this.f16568e, strArr);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private C6670f(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        FragmentC6649b bVar = (FragmentC6649b) fragmentManager.findFragmentByTag("PermissionsRequest");
        if (bVar == null) {
            bVar = new FragmentC6649b();
            fragmentManager.beginTransaction().add(bVar, "PermissionsRequest").commitAllowingStateLoss();
            fragmentManager.executePendingTransactions();
        }
        this.f16563a = bVar;
    }

    /* synthetic */ C6670f(Activity activity, byte b) {
        this(activity);
    }

    /* renamed from: com.bytedance.android.livesdk.ag.f$c */
    public static class C6673c implements AbstractC6654b {
        static {
            Covode.recordClassIndex(7411);
        }

        @Override // com.bytedance.android.livesdk.p437ag.p439b.AbstractC6654b
        /* renamed from: a */
        public final void mo12804a(Activity activity, AbstractC6655c cVar, String[] strArr) {
            cVar.mo12798a();
        }
    }

    /* renamed from: a */
    public final void mo12812a(AbstractC6656d dVar, Runnable runnable, AbstractC6654b bVar, AbstractC6654b bVar2, Runnable runnable2, String... strArr) {
        FragmentC6649b bVar3 = this.f16563a;
        C3854a.m9453a(3, "PermissionFragment", "requestPermissions: ");
        FragmentC6649b.C6652a aVar = new FragmentC6649b.C6652a(strArr, runnable, dVar, bVar, runnable2, bVar2);
        String[] a = C6667d.m14178a(bVar3.getActivity(), aVar.f16549a);
        if (a.length == 0) {
            aVar.mo12802a(false);
            return;
        }
        aVar.f16550b = a;
        aVar.f16552d.run();
        C6668e eVar = C6668e.C6669a.f16562a;
        String[] strArr2 = aVar.f16550b;
        if (strArr2 != null) {
            for (String str : strArr2) {
                Iterator<Object> it = eVar.mo12808a(str).iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
        if (Build.VERSION.SDK_INT < 23 || C6662e.C6663a.f16559a.mo12806a()) {
            bVar3.mo12794a(aVar);
            return;
        }
        aVar.f16551c.mo12804a(bVar3.getActivity(), 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0073: INVOKE  
              (wrap: com.bytedance.android.livesdk.ag.b.b : 0x006f: IGET  (r1v4 com.bytedance.android.livesdk.ag.b.b) = (r7v0 'aVar' com.bytedance.android.livesdk.ag.b$a) com.bytedance.android.livesdk.ag.b.a.c com.bytedance.android.livesdk.ag.b.b)
              (wrap: android.app.Activity : 0x006b: INVOKE  (r2v1 android.app.Activity) = (r6v0 'bVar3' com.bytedance.android.livesdk.ag.b) type: VIRTUAL call: com.bytedance.android.livesdk.ag.b.getActivity():android.app.Activity)
              (wrap: com.bytedance.android.livesdk.ag.b$1 : 0x0068: CONSTRUCTOR  (r3v1 com.bytedance.android.livesdk.ag.b$1) = (r6v0 'bVar3' com.bytedance.android.livesdk.ag.b), (r7v0 'aVar' com.bytedance.android.livesdk.ag.b$a) call: com.bytedance.android.livesdk.ag.b.1.<init>(com.bytedance.android.livesdk.ag.b, com.bytedance.android.livesdk.ag.b$a):void type: CONSTRUCTOR)
              (wrap: java.lang.String[] : 0x0071: IGET  (r0v8 java.lang.String[]) = (r7v0 'aVar' com.bytedance.android.livesdk.ag.b$a) com.bytedance.android.livesdk.ag.b.a.a java.lang.String[])
             type: INTERFACE call: com.bytedance.android.livesdk.ag.b.b.a(android.app.Activity, com.bytedance.android.livesdk.ag.b.c, java.lang.String[]):void in method: com.bytedance.android.livesdk.ag.f.a(com.bytedance.android.livesdk.ag.b.d, java.lang.Runnable, com.bytedance.android.livesdk.ag.b.b, com.bytedance.android.livesdk.ag.b.b, java.lang.Runnable, java.lang.String[]):void, file: classes8.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0068: CONSTRUCTOR  (r3v1 com.bytedance.android.livesdk.ag.b$1) = (r6v0 'bVar3' com.bytedance.android.livesdk.ag.b), (r7v0 'aVar' com.bytedance.android.livesdk.ag.b$a) call: com.bytedance.android.livesdk.ag.b.1.<init>(com.bytedance.android.livesdk.ag.b, com.bytedance.android.livesdk.ag.b$a):void type: CONSTRUCTOR in method: com.bytedance.android.livesdk.ag.f.a(com.bytedance.android.livesdk.ag.b.d, java.lang.Runnable, com.bytedance.android.livesdk.ag.b.b, com.bytedance.android.livesdk.ag.b.b, java.lang.Runnable, java.lang.String[]):void, file: classes8.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 22 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.livesdk.ag.b, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 28 more
            */
        /*
        // Method dump skipped, instructions count: 119
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.p437ag.C6670f.mo12812a(com.bytedance.android.livesdk.ag.b.d, java.lang.Runnable, com.bytedance.android.livesdk.ag.b.b, com.bytedance.android.livesdk.ag.b.b, java.lang.Runnable, java.lang.String[]):void");
    }
}
