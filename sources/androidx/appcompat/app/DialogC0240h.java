package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.AbstractC0274b;
import androidx.core.p037h.C0775f;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.appcompat.app.h */
public class DialogC0240h extends Dialog implements AbstractC0219e {

    /* renamed from: a */
    private AbstractC0220f f735a;

    /* renamed from: b */
    private final C0775f.AbstractC0776a f736b;

    static {
        Covode.recordClassIndex(274);
    }

    @Override // androidx.appcompat.app.AbstractC0219e
    public void onSupportActionModeFinished(AbstractC0274b bVar) {
    }

    @Override // androidx.appcompat.app.AbstractC0219e
    public void onSupportActionModeStarted(AbstractC0274b bVar) {
    }

    @Override // androidx.appcompat.app.AbstractC0219e
    public AbstractC0274b onWindowStartingSupportActionMode(AbstractC0274b.AbstractC0275a aVar) {
        return null;
    }

    public void invalidateOptionsMenu() {
        mo9590b().mo528g();
    }

    /* renamed from: b */
    private AbstractC0220f mo9590b() {
        if (this.f735a == null) {
            this.f735a = AbstractC0220f.m682a(this, this);
        }
        return this.f735a;
    }

    public final boolean cn_() {
        return mo9590b().mo524c(1);
    }

    public void onStop() {
        super.onStop();
        mo9590b().mo526e();
    }

    public DialogC0240h(Context context) {
        this(context, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo586a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        mo9590b().mo520b(i);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C0775f.m2699a(this.f736b, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) mo9590b().mo510a(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        mo9590b().mo515a(view);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        mo9590b().mo518a(charSequence);
    }

    public void onCreate(Bundle bundle) {
        mo9590b().mo531j();
        super.onCreate(bundle);
        mo9590b().mo514a(bundle);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        mo9590b().mo518a(getContext().getString(i));
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo9590b().mo522b(view, layoutParams);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo9590b().mo516a(view, layoutParams);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DialogC0240h(android.content.Context r5, int r6) {
        /*
            r4 = this;
            if (r6 != 0) goto L_0x0014
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r2 = r5.getTheme()
            r1 = 2130969243(0x7f04029b, float:1.7547162E38)
            r0 = 1
            r2.resolveAttribute(r1, r3, r0)
            int r6 = r3.resourceId
        L_0x0014:
            r4.<init>(r5, r6)
            androidx.appcompat.app.h$1 r0 = new androidx.appcompat.app.h$1
            r0.<init>()
            r4.f736b = r0
            androidx.appcompat.app.f r1 = r4.mo9590b()
            r0 = 0
            r1.mo514a(r0)
            androidx.appcompat.app.f r0 = r4.mo9590b()
            r0.mo532k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.DialogC0240h.<init>(android.content.Context, int):void");
    }
}
