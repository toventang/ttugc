package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.C1182af;
import com.bytedance.covode.number.Covode;

public final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new Parcelable.Creator<FragmentState>() {
        /* class androidx.fragment.app.FragmentState.C09381 */

        static {
            Covode.recordClassIndex(1031);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ FragmentState[] newArray(int i) {
            return new FragmentState[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }
    };

    /* renamed from: a */
    public final String f3335a;

    /* renamed from: b */
    final int f3336b;

    /* renamed from: c */
    final boolean f3337c;

    /* renamed from: d */
    final int f3338d;

    /* renamed from: e */
    final int f3339e;

    /* renamed from: f */
    final String f3340f;

    /* renamed from: g */
    final boolean f3341g;

    /* renamed from: h */
    final boolean f3342h;

    /* renamed from: i */
    final Bundle f3343i;

    /* renamed from: j */
    final boolean f3344j;

    /* renamed from: k */
    Bundle f3345k;

    /* renamed from: l */
    Fragment f3346l;

    public final int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(1030);
    }

    FragmentState(Fragment fragment) {
        this.f3335a = fragment.getClass().getName();
        this.f3336b = fragment.mIndex;
        this.f3337c = fragment.mFromLayout;
        this.f3338d = fragment.mFragmentId;
        this.f3339e = fragment.mContainerId;
        this.f3340f = fragment.mTag;
        this.f3341g = fragment.mRetainInstance;
        this.f3342h = fragment.mDetached;
        this.f3343i = fragment.mArguments;
        this.f3344j = fragment.mHidden;
    }

    FragmentState(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        this.f3335a = parcel.readString();
        this.f3336b = parcel.readInt();
        boolean z4 = true;
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f3337c = z;
        this.f3338d = parcel.readInt();
        this.f3339e = parcel.readInt();
        this.f3340f = parcel.readString();
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f3341g = z2;
        if (parcel.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f3342h = z3;
        this.f3343i = parcel.readBundle();
        this.f3344j = parcel.readInt() == 0 ? false : z4;
        this.f3345k = parcel.readBundle();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3335a);
        parcel.writeInt(this.f3336b);
        parcel.writeInt(this.f3337c ? 1 : 0);
        parcel.writeInt(this.f3338d);
        parcel.writeInt(this.f3339e);
        parcel.writeString(this.f3340f);
        parcel.writeInt(this.f3341g ? 1 : 0);
        parcel.writeInt(this.f3342h ? 1 : 0);
        parcel.writeBundle(this.f3343i);
        parcel.writeInt(this.f3344j ? 1 : 0);
        parcel.writeBundle(this.f3345k);
    }

    /* renamed from: a */
    public final Fragment mo3444a(AbstractC0951h hVar, AbstractC0949f fVar, Fragment fragment, C0973k kVar, C1182af afVar) {
        if (this.f3346l == null) {
            Context context = hVar.f3383c;
            Bundle bundle = this.f3343i;
            if (bundle != null) {
                bundle.setClassLoader(context.getClassLoader());
            }
            if (fVar != null) {
                this.f3346l = fVar.mo3431a(context, this.f3335a, this.f3343i);
            } else {
                this.f3346l = Fragment.instantiate(context, this.f3335a, this.f3343i);
            }
            Bundle bundle2 = this.f3345k;
            if (bundle2 != null) {
                bundle2.setClassLoader(context.getClassLoader());
                this.f3346l.mSavedFragmentState = this.f3345k;
            }
            this.f3346l.setIndex(this.f3336b, fragment);
            this.f3346l.mFromLayout = this.f3337c;
            this.f3346l.mRestored = true;
            this.f3346l.mFragmentId = this.f3338d;
            this.f3346l.mContainerId = this.f3339e;
            this.f3346l.mTag = this.f3340f;
            this.f3346l.mRetainInstance = this.f3341g;
            this.f3346l.mDetached = this.f3342h;
            this.f3346l.mHidden = this.f3344j;
            this.f3346l.mFragmentManager = hVar.f3385e;
        }
        this.f3346l.mChildNonConfig = kVar;
        this.f3346l.mViewModelStore = afVar;
        return this.f3346l;
    }
}
