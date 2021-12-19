package androidx.loader.p062a;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import androidx.core.p036g.C0689b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: androidx.loader.a.c */
public class C1232c<D> {

    /* renamed from: n */
    public int f4048n;

    /* renamed from: o */
    public AbstractC1234b<D> f4049o;

    /* renamed from: p */
    public Context f4050p;

    /* renamed from: q */
    public boolean f4051q;

    /* renamed from: r */
    public boolean f4052r;

    /* renamed from: s */
    public boolean f4053s = true;

    /* renamed from: t */
    boolean f4054t;

    /* renamed from: u */
    boolean f4055u;

    /* renamed from: androidx.loader.a.c$b */
    public interface AbstractC1234b<D> {
        static {
            Covode.recordClassIndex(1341);
        }

        /* renamed from: a */
        void mo4088a(D d);
    }

    static {
        Covode.recordClassIndex(1339);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4061a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo4065b() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo4075g() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo4076h() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo4077i() {
    }

    /* renamed from: l */
    public final void mo4081l() {
        mo4061a();
    }

    /* renamed from: k */
    public final boolean mo4080k() {
        return mo4065b();
    }

    /* renamed from: m */
    public final void mo4082m() {
        this.f4051q = false;
        mo4076h();
    }

    /* renamed from: j */
    public final void mo4079j() {
        this.f4051q = true;
        this.f4053s = false;
        this.f4052r = false;
        mo4075g();
    }

    /* renamed from: n */
    public final void mo4083n() {
        mo4077i();
        this.f4053s = true;
        this.f4051q = false;
        this.f4052r = false;
        this.f4054t = false;
        this.f4055u = false;
    }

    /* renamed from: o */
    public void mo4084o() {
        if (this.f4051q) {
            mo4061a();
        } else {
            this.f4054t = true;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        C0689b.m2445a(this, sb);
        sb.append(" id=");
        sb.append(this.f4048n);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: androidx.loader.a.c$a */
    public final class C1233a extends ContentObserver {
        static {
            Covode.recordClassIndex(1340);
        }

        public final boolean deliverSelfNotifications() {
            return true;
        }

        public final void onChange(boolean z) {
            C1232c.this.mo4084o();
        }

        public C1233a() {
            super(new Handler());
        }
    }

    /* renamed from: b */
    public void mo4073b(D d) {
        AbstractC1234b<D> bVar = this.f4049o;
        if (bVar != null) {
            bVar.mo4088a(d);
        }
    }

    public C1232c(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f4050p = applicationContext;
    }

    /* renamed from: c */
    public static String m3954c(D d) {
        StringBuilder sb = new StringBuilder(64);
        C0689b.m2445a(d, sb);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo4078a(AbstractC1234b<D> bVar) {
        AbstractC1234b<D> bVar2 = this.f4049o;
        if (bVar2 == null) {
            throw new IllegalStateException("No listener register");
        } else if (bVar2 == bVar) {
            this.f4049o = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }

    /* renamed from: a */
    public void mo4064a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f4048n);
        printWriter.print(" mListener=");
        printWriter.println(this.f4049o);
        if (this.f4051q || this.f4054t || this.f4055u) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f4051q);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f4054t);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f4055u);
        }
        if (this.f4052r || this.f4053s) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f4052r);
            printWriter.print(" mReset=");
            printWriter.println(this.f4053s);
        }
    }
}
