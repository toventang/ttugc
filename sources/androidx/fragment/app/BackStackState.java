package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.C0942c;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new Parcelable.Creator<BackStackState>() {
        /* class androidx.fragment.app.BackStackState.C09291 */

        static {
            Covode.recordClassIndex(1018);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ BackStackState[] newArray(int i) {
            return new BackStackState[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }
    };

    /* renamed from: a */
    final int[] f3295a;

    /* renamed from: b */
    final int f3296b;

    /* renamed from: c */
    final int f3297c;

    /* renamed from: d */
    final String f3298d;

    /* renamed from: e */
    final int f3299e;

    /* renamed from: f */
    final int f3300f;

    /* renamed from: g */
    final CharSequence f3301g;

    /* renamed from: h */
    final int f3302h;

    /* renamed from: i */
    final CharSequence f3303i;

    /* renamed from: j */
    final ArrayList<String> f3304j;

    /* renamed from: k */
    final ArrayList<String> f3305k;

    /* renamed from: l */
    final boolean f3306l;

    public final int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(1017);
    }

    public BackStackState(Parcel parcel) {
        boolean z;
        this.f3295a = parcel.createIntArray();
        this.f3296b = parcel.readInt();
        this.f3297c = parcel.readInt();
        this.f3298d = parcel.readString();
        this.f3299e = parcel.readInt();
        this.f3300f = parcel.readInt();
        this.f3301g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3302h = parcel.readInt();
        this.f3303i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3304j = parcel.createStringArrayList();
        this.f3305k = parcel.createStringArrayList();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f3306l = z;
    }

    public BackStackState(C0942c cVar) {
        int i;
        int size = cVar.f3349b.size();
        this.f3295a = new int[(size * 6)];
        if (cVar.f3356i) {
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                C0942c.C0943a aVar = cVar.f3349b.get(i3);
                int i4 = i2 + 1;
                this.f3295a[i2] = aVar.f3369a;
                int[] iArr = this.f3295a;
                int i5 = i4 + 1;
                if (aVar.f3370b != null) {
                    i = aVar.f3370b.mIndex;
                } else {
                    i = -1;
                }
                iArr[i4] = i;
                int i6 = i5 + 1;
                this.f3295a[i5] = aVar.f3371c;
                int i7 = i6 + 1;
                this.f3295a[i6] = aVar.f3372d;
                int i8 = i7 + 1;
                this.f3295a[i7] = aVar.f3373e;
                i2 = i8 + 1;
                this.f3295a[i8] = aVar.f3374f;
            }
            this.f3296b = cVar.f3354g;
            this.f3297c = cVar.f3355h;
            this.f3298d = cVar.f3358k;
            this.f3299e = cVar.f3360m;
            this.f3300f = cVar.f3361n;
            this.f3301g = cVar.f3362o;
            this.f3302h = cVar.f3363p;
            this.f3303i = cVar.f3364q;
            this.f3304j = cVar.f3365r;
            this.f3305k = cVar.f3366s;
            this.f3306l = cVar.f3367t;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* renamed from: a */
    public final C0942c mo3264a(LayoutInflater$Factory2C0956j jVar) {
        C0942c cVar = new C0942c(jVar);
        int i = 0;
        while (i < this.f3295a.length) {
            C0942c.C0943a aVar = new C0942c.C0943a();
            int i2 = i + 1;
            aVar.f3369a = this.f3295a[i];
            int i3 = i2 + 1;
            int i4 = this.f3295a[i2];
            if (i4 >= 0) {
                aVar.f3370b = jVar.f3402f.get(i4);
            } else {
                aVar.f3370b = null;
            }
            int i5 = i3 + 1;
            aVar.f3371c = this.f3295a[i3];
            int i6 = i5 + 1;
            aVar.f3372d = this.f3295a[i5];
            int i7 = i6 + 1;
            aVar.f3373e = this.f3295a[i6];
            i = i7 + 1;
            aVar.f3374f = this.f3295a[i7];
            cVar.f3350c = aVar.f3371c;
            cVar.f3351d = aVar.f3372d;
            cVar.f3352e = aVar.f3373e;
            cVar.f3353f = aVar.f3374f;
            cVar.mo3461a(aVar);
        }
        cVar.f3354g = this.f3296b;
        cVar.f3355h = this.f3297c;
        cVar.f3358k = this.f3298d;
        cVar.f3360m = this.f3299e;
        cVar.f3356i = true;
        cVar.f3361n = this.f3300f;
        cVar.f3362o = this.f3301g;
        cVar.f3363p = this.f3302h;
        cVar.f3364q = this.f3303i;
        cVar.f3365r = this.f3304j;
        cVar.f3366s = this.f3305k;
        cVar.f3367t = this.f3306l;
        cVar.mo3459a(1);
        return cVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f3295a);
        parcel.writeInt(this.f3296b);
        parcel.writeInt(this.f3297c);
        parcel.writeString(this.f3298d);
        parcel.writeInt(this.f3299e);
        parcel.writeInt(this.f3300f);
        TextUtils.writeToParcel(this.f3301g, parcel, 0);
        parcel.writeInt(this.f3302h);
        TextUtils.writeToParcel(this.f3303i, parcel, 0);
        parcel.writeStringList(this.f3304j);
        parcel.writeStringList(this.f3305k);
        parcel.writeInt(this.f3306l ? 1 : 0);
    }
}
