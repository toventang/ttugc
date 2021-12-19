package androidx.loader.p062a;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.core.content.C0626a;
import androidx.core.p033d.C0646a;
import androidx.core.p033d.C0650d;
import androidx.loader.p062a.C1232c;
import com.bytedance.covode.number.Covode;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* renamed from: androidx.loader.a.b */
public class C1231b extends AbstractC1229a<Cursor> {

    /* renamed from: f */
    final C1232c<Cursor>.C1233a f4040f = new C1232c.C1233a();

    /* renamed from: g */
    public Uri f4041g;

    /* renamed from: h */
    public String[] f4042h;

    /* renamed from: i */
    public String f4043i;

    /* renamed from: j */
    public String[] f4044j;

    /* renamed from: k */
    public String f4045k;

    /* renamed from: l */
    Cursor f4046l;

    /* renamed from: m */
    C0646a f4047m;

    static {
        Covode.recordClassIndex(1338);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.loader.p062a.C1232c
    /* renamed from: h */
    public final void mo4076h() {
        mo4080k();
    }

    @Override // androidx.loader.p062a.AbstractC1229a
    /* renamed from: e */
    public final void mo4068e() {
        super.mo4068e();
        synchronized (this) {
            C0646a aVar = this.f4047m;
            if (aVar != null) {
                aVar.mo2676b();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.loader.p062a.C1232c
    /* renamed from: g */
    public final void mo4075g() {
        Cursor cursor = this.f4046l;
        if (cursor != null) {
            mo4073b(cursor);
        }
        boolean z = this.f4054t;
        this.f4054t = false;
        this.f4055u |= z;
        if (z || this.f4046l == null) {
            mo4081l();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.loader.p062a.C1232c
    /* renamed from: i */
    public final void mo4077i() {
        super.mo4077i();
        mo4080k();
        Cursor cursor = this.f4046l;
        if (cursor != null && !cursor.isClosed()) {
            this.f4046l.close();
        }
        this.f4046l = null;
    }

    /* renamed from: f */
    public Cursor mo4067d() {
        boolean z;
        synchronized (this) {
            if (this.f4032b != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.f4047m = new C0646a();
            } else {
                throw new C0650d();
            }
        }
        try {
            Cursor a = C0626a.m2327a(this.f4050p.getContentResolver(), this.f4041g, this.f4042h, this.f4043i, this.f4044j, this.f4045k, this.f4047m);
            if (a != null) {
                try {
                    a.getCount();
                    a.registerContentObserver(this.f4040f);
                } catch (RuntimeException e) {
                    a.close();
                    throw e;
                }
            }
            synchronized (this) {
                this.f4047m = null;
            }
            return a;
        } catch (Throwable th) {
            synchronized (this) {
                this.f4047m = null;
                throw th;
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.loader.p062a.AbstractC1229a
    /* renamed from: a */
    public final /* synthetic */ void mo4063a(Cursor cursor) {
        Cursor cursor2 = cursor;
        if (cursor2 != null && !cursor2.isClosed()) {
            cursor2.close();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo4073b(Cursor cursor) {
        if (!this.f4053s) {
            Cursor cursor2 = this.f4046l;
            this.f4046l = cursor;
            if (this.f4051q) {
                super.mo4073b(cursor);
            }
            if (cursor2 != null && cursor2 != cursor && !cursor2.isClosed()) {
                cursor2.close();
            }
        } else if (cursor != null) {
            cursor.close();
        }
    }

    @Override // androidx.loader.p062a.C1232c, androidx.loader.p062a.AbstractC1229a
    /* renamed from: a */
    public final void mo4064a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo4064a(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f4041g);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f4042h));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f4043i);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f4044j));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f4045k);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f4046l);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.f4054t);
    }

    public C1231b(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        super(context);
        this.f4041g = uri;
        this.f4042h = strArr;
        this.f4043i = str;
        this.f4044j = strArr2;
        this.f4045k = str2;
    }
}
