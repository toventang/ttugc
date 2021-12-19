package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;

/* renamed from: androidx.versionedparcelable.b */
final class C1568b extends AbstractC1567a {

    /* renamed from: d */
    private final SparseIntArray f5145d;

    /* renamed from: e */
    private final Parcel f5146e;

    /* renamed from: f */
    private final int f5147f;

    /* renamed from: g */
    private final int f5148g;

    /* renamed from: h */
    private final String f5149h;

    /* renamed from: i */
    private int f5150i;

    /* renamed from: j */
    private int f5151j;

    /* renamed from: k */
    private int f5152k;

    static {
        Covode.recordClassIndex(1712);
    }

    @Override // androidx.versionedparcelable.AbstractC1567a
    /* renamed from: c */
    public final int mo5225c() {
        return this.f5146e.readInt();
    }

    @Override // androidx.versionedparcelable.AbstractC1567a
    /* renamed from: d */
    public final String mo5230d() {
        return this.f5146e.readString();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.versionedparcelable.AbstractC1567a
    /* renamed from: f */
    public final CharSequence mo5232f() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f5146e);
    }

    @Override // androidx.versionedparcelable.AbstractC1567a
    /* renamed from: g */
    public final <T extends Parcelable> T mo5233g() {
        return (T) this.f5146e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.AbstractC1567a
    /* renamed from: h */
    public final boolean mo5234h() {
        if (this.f5146e.readInt() != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.versionedparcelable.AbstractC1567a
    /* renamed from: e */
    public final byte[] mo5231e() {
        int readInt = this.f5146e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f5146e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.AbstractC1567a
    /* renamed from: a */
    public final void mo5204a() {
        int i = this.f5150i;
        if (i >= 0) {
            int i2 = this.f5145d.get(i);
            int dataPosition = this.f5146e.dataPosition();
            this.f5146e.setDataPosition(i2);
            this.f5146e.writeInt(dataPosition - i2);
            this.f5146e.setDataPosition(dataPosition);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.versionedparcelable.AbstractC1567a
    /* renamed from: b */
    public final AbstractC1567a mo5218b() {
        Parcel parcel = this.f5146e;
        int dataPosition = parcel.dataPosition();
        int i = this.f5151j;
        if (i == this.f5147f) {
            i = this.f5148g;
        }
        return new C1568b(parcel, dataPosition, i, this.f5149h + "  ", this.f5142a, this.f5143b, this.f5144c);
    }

    @Override // androidx.versionedparcelable.AbstractC1567a
    /* renamed from: a */
    public final void mo5205a(int i) {
        this.f5146e.writeInt(i);
    }

    @Override // androidx.versionedparcelable.AbstractC1567a
    /* renamed from: a */
    public final void mo5207a(Parcelable parcelable) {
        this.f5146e.writeParcelable(parcelable, 0);
    }

    C1568b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0484a(), new C0484a(), new C0484a());
    }

    /* access modifiers changed from: protected */
    @Override // androidx.versionedparcelable.AbstractC1567a
    /* renamed from: a */
    public final void mo5210a(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f5146e, 0);
    }

    @Override // androidx.versionedparcelable.AbstractC1567a
    /* renamed from: c */
    public final void mo5228c(int i) {
        mo5204a();
        this.f5150i = i;
        this.f5145d.put(i, this.f5146e.dataPosition());
        mo5205a(0);
        mo5205a(i);
    }

    @Override // androidx.versionedparcelable.AbstractC1567a
    /* renamed from: a */
    public final void mo5212a(String str) {
        this.f5146e.writeString(str);
    }

    @Override // androidx.versionedparcelable.AbstractC1567a
    /* renamed from: b */
    public final boolean mo5223b(int i) {
        while (this.f5151j < this.f5148g) {
            int i2 = this.f5152k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f5146e.setDataPosition(this.f5151j);
            int readInt = this.f5146e.readInt();
            this.f5152k = this.f5146e.readInt();
            this.f5151j += readInt;
        }
        if (this.f5152k == i) {
            return true;
        }
        return false;
    }

    @Override // androidx.versionedparcelable.AbstractC1567a
    /* renamed from: a */
    public final void mo5213a(boolean z) {
        this.f5146e.writeInt(z ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.AbstractC1567a
    /* renamed from: a */
    public final void mo5215a(byte[] bArr) {
        if (bArr != null) {
            this.f5146e.writeInt(bArr.length);
            this.f5146e.writeByteArray(bArr);
            return;
        }
        this.f5146e.writeInt(-1);
    }

    private C1568b(Parcel parcel, int i, int i2, String str, C0484a<String, Method> aVar, C0484a<String, Method> aVar2, C0484a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f5145d = new SparseIntArray();
        this.f5150i = -1;
        this.f5151j = 0;
        this.f5152k = -1;
        this.f5146e = parcel;
        this.f5147f = i;
        this.f5148g = i2;
        this.f5151j = i;
        this.f5149h = str;
    }
}
