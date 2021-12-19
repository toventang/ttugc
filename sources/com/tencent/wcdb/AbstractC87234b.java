package com.tencent.wcdb;

import android.database.CharArrayBuffer;
import com.bytedance.covode.number.Covode;

/* renamed from: com.tencent.wcdb.b */
public abstract class AbstractC87234b extends AbstractC87232a {

    /* renamed from: i */
    protected CursorWindow f197599i;

    static {
        Covode.recordClassIndex(103091);
    }

    /* access modifiers changed from: protected */
    @Override // com.tencent.wcdb.AbstractC87232a
    /* renamed from: a */
    public final void mo141117a() {
        super.mo141117a();
        mo141160c();
    }

    /* access modifiers changed from: protected */
    @Override // com.tencent.wcdb.AbstractC87232a
    /* renamed from: b */
    public final void mo141119b() {
        super.mo141119b();
        if (this.f197599i == null) {
            throw new C87269k("Attempting to access a closed CursorWindow.Most probable cause: cursor is deactivated prior to calling this method.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo141160c() {
        CursorWindow cursorWindow = this.f197599i;
        if (cursorWindow != null) {
            cursorWindow.close();
            this.f197599i = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo141159a(String str) {
        CursorWindow cursorWindow = this.f197599i;
        if (cursorWindow == null) {
            this.f197599i = new CursorWindow(str);
        } else {
            cursorWindow.mo141104a();
        }
    }

    @Override // com.tencent.wcdb.AbstractC87232a
    public byte[] getBlob(int i) {
        mo141119b();
        return this.f197599i.mo141106b(this.f197586b, i);
    }

    public double getDouble(int i) {
        mo141119b();
        return this.f197599i.mo141111e(this.f197586b, i);
    }

    public float getFloat(int i) {
        mo141119b();
        return (float) this.f197599i.mo141111e(this.f197586b, i);
    }

    @Override // com.tencent.wcdb.AbstractC87236d
    public int getInt(int i) {
        mo141119b();
        return (int) this.f197599i.mo141109d(this.f197586b, i);
    }

    @Override // com.tencent.wcdb.AbstractC87236d, com.tencent.wcdb.AbstractC87232a
    public long getLong(int i) {
        mo141119b();
        return this.f197599i.mo141109d(this.f197586b, i);
    }

    public short getShort(int i) {
        mo141119b();
        return (short) ((int) this.f197599i.mo141109d(this.f197586b, i));
    }

    @Override // com.tencent.wcdb.AbstractC87236d, com.tencent.wcdb.AbstractC87232a
    public String getString(int i) {
        mo141119b();
        return this.f197599i.mo141107c(this.f197586b, i);
    }

    @Override // com.tencent.wcdb.AbstractC87232a
    public int getType(int i) {
        mo141119b();
        return this.f197599i.mo141103a(this.f197586b, i);
    }

    public boolean isNull(int i) {
        mo141119b();
        if (this.f197599i.mo141103a(this.f197586b, i) == 0) {
            return true;
        }
        return false;
    }

    @Override // com.tencent.wcdb.AbstractC87232a
    public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
        mo141119b();
        CursorWindow cursorWindow = this.f197599i;
        int i2 = this.f197586b;
        if (charArrayBuffer != null) {
            cursorWindow.mo141228d();
            try {
                CursorWindow.nativeCopyStringToBuffer(cursorWindow.f197582a, i2 - cursorWindow.f197583b, i, charArrayBuffer);
            } finally {
                cursorWindow.mo141229e();
            }
        } else {
            throw new IllegalArgumentException("CharArrayBuffer should not be null");
        }
    }
}
