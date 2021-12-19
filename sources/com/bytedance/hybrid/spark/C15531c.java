package com.bytedance.hybrid.spark;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.p1108b.C15529a;
import com.bytedance.hybrid.spark.p1111e.C15573c;
import com.bytedance.hybrid.spark.p1111e.C15575e;
import com.bytedance.hybrid.spark.page.C15583b;
import com.bytedance.hybrid.spark.page.C15593c;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.ies.xbridge.C18371a;
import com.bytedance.lynx.hybrid.p1524j.C21213f;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.hybrid.spark.c */
public final class C15531c {

    /* renamed from: a */
    public static final CopyOnWriteArrayList<Object> f37877a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    public static final C15532a f37878b = new C15532a((byte) 0);

    /* renamed from: e */
    private static boolean f37879e;

    /* renamed from: c */
    private final Context f37880c;

    /* renamed from: d */
    private final SparkContext f37881d;

    /* renamed from: com.bytedance.hybrid.spark.c$a */
    public static final class C15532a {
        static {
            Covode.recordClassIndex(17794);
        }

        private C15532a() {
        }

        public /* synthetic */ C15532a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C15531c m28665a(Context context, SparkContext sparkContext) {
            C89219l.m154719c(context, "");
            C89219l.m154719c(sparkContext, "");
            Iterator<T> it = C15531c.f37877a.iterator();
            while (it.hasNext()) {
                it.next();
            }
            return new C15531c(context, sparkContext, (byte) 0);
        }
    }

    /* renamed from: c */
    private final void m28661c() {
        C21213f.m39929a(this.f37881d.f50280f, "open_time", System.currentTimeMillis());
    }

    /* renamed from: d */
    private static void m28662d() {
        if (!f37879e) {
            C18371a.m34208a(C15529a.class, null, null, 6);
            f37879e = true;
        }
    }

    static {
        Covode.recordClassIndex(17793);
    }

    /* renamed from: b */
    public final C15593c mo25317b() {
        m28661c();
        m28662d();
        C15573c.m28691a("Spark", "createView", this.f37881d);
        C15593c cVar = new C15593c(this.f37880c, (byte) 0);
        cVar.mo25371a(this.f37881d);
        return cVar;
    }

    /* renamed from: a */
    public final void mo25316a() {
        m28661c();
        m28662d();
        int a = C15575e.C15576a.m28693a(this.f37881d.f37778a);
        C15573c.m28691a("Spark", "navigate type:".concat(String.valueOf(a)), this.f37881d);
        if (a != 2 || !(this.f37880c instanceof ActivityC0945e)) {
            Intent intent = new Intent(this.f37880c, SparkActivity.class);
            intent.putExtra("sparkContext", this.f37881d);
            intent.setFlags(268435456);
            Context context = this.f37880c;
            C84349a.m145093a(intent, context);
            context.startActivity(intent);
            return;
        }
        String str = "SparkPopup#" + this.f37881d.f37778a.hashCode();
        Fragment a2 = ((ActivityC0945e) this.f37880c).getSupportFragmentManager().mo3551a(str);
        if (a2 instanceof C15583b) {
            C15583b bVar = (C15583b) a2;
            Bundle arguments = bVar.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            C89219l.m154709a((Object) arguments, "");
            arguments.putParcelable("sparkContext", this.f37881d);
            bVar.setArguments(arguments);
            bVar.mo25252b();
            return;
        }
        C15583b bVar2 = new C15583b();
        Bundle bundle = new Bundle();
        bundle.putParcelable("sparkContext", this.f37881d);
        bVar2.setArguments(bundle);
        bVar2.show(((ActivityC0945e) this.f37880c).getSupportFragmentManager(), str);
    }

    private C15531c(Context context, SparkContext sparkContext) {
        this.f37880c = context;
        this.f37881d = sparkContext;
    }

    public /* synthetic */ C15531c(Context context, SparkContext sparkContext, byte b) {
        this(context, sparkContext);
    }
}
