package p4646ms.p4647bd.p4648o;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.Objects;
import p4646ms.p4647bd.p4648o.C89915n1;

/* renamed from: ms.bd.o.m1 */
public final class C89909m1 implements C89915n1.AbstractC89916a {

    /* renamed from: a */
    private long f203791a;

    /* renamed from: b */
    private Context f203792b;

    /* renamed from: c */
    private C89879e0 f203793c;

    static {
        Covode.recordClassIndex(106006);
    }

    @Override // p4646ms.p4647bd.p4648o.C89915n1.AbstractC89916a
    /* renamed from: a */
    public final void mo35024a(int i) {
        long j = this.f203791a;
        if (j != -1) {
            C89868b.m155937a(33554438, i, j, null, null);
        }
    }

    @Override // p4646ms.p4647bd.p4648o.C89915n1.AbstractC89916a
    /* renamed from: a */
    public final void mo35025a(String str) {
        if (this.f203791a != -1 && !TextUtils.isEmpty(str)) {
            C89868b.m155937a(33554433, 0, this.f203791a, str, this.f203792b);
        }
    }

    @Override // p4646ms.p4647bd.p4648o.C89915n1.AbstractC89916a
    /* renamed from: b */
    public final void mo35026b(String str) {
        this.f203793c.f203769d = str;
        long j = this.f203791a;
        if (j != -1) {
            C89868b.m155937a(33554434, 0, j, str, this.f203792b);
        }
    }

    @Override // p4646ms.p4647bd.p4648o.C89915n1.AbstractC89916a
    /* renamed from: c */
    public final void mo35027c(String str) {
        this.f203793c.f203771f = str;
        long j = this.f203791a;
        if (j != -1) {
            C89868b.m155937a(33554435, 0, j, str, this.f203792b);
        }
    }

    @Override // p4646ms.p4647bd.p4648o.C89915n1.AbstractC89916a
    /* renamed from: d */
    public final void mo35028d(String str) {
        this.f203793c.f203772g = str;
        long j = this.f203791a;
        if (j != -1) {
            C89868b.m155937a(33554436, 0, j, str, this.f203792b);
        }
    }

    C89909m1(C89879e0 e0Var, Context context, long j) {
        Objects.requireNonNull(e0Var, "config could not be null");
        Objects.requireNonNull(context, "context could not be null");
        this.f203793c = e0Var;
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f203792b = applicationContext;
        this.f203791a = j;
    }
}
