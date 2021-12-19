package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.MenuItem;
import androidx.appcompat.view.menu.AbstractC0318o;
import androidx.appcompat.view.menu.C0302h;
import androidx.appcompat.view.menu.C0306j;
import androidx.appcompat.view.menu.SubMenuC0328u;
import androidx.p060l.C1142o;
import com.bytedance.covode.number.Covode;

public class BottomNavigationPresenter implements AbstractC0318o {

    /* renamed from: a */
    public C26602c f62834a;

    /* renamed from: b */
    public boolean f62835b;

    /* renamed from: c */
    public int f62836c;

    /* renamed from: d */
    private C0302h f62837d;

    static {
        Covode.recordClassIndex(32037);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: a */
    public final void mo892a(C0302h hVar, boolean z) {
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: a */
    public final void mo894a(AbstractC0318o.AbstractC0319a aVar) {
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: a */
    public final boolean mo896a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: a */
    public final boolean mo899a(SubMenuC0328u uVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: b */
    public final boolean mo901b(C0306j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: c */
    public final boolean mo902c(C0306j jVar) {
        return false;
    }

    static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class com.google.android.material.bottomnavigation.BottomNavigationPresenter.SavedState.C265951 */

            static {
                Covode.recordClassIndex(32039);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };

        /* renamed from: a */
        int f62838a;

        public int describeContents() {
            return 0;
        }

        SavedState() {
        }

        static {
            Covode.recordClassIndex(32038);
        }

        SavedState(Parcel parcel) {
            this.f62838a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f62838a);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: b */
    public final int mo900b() {
        return this.f62836c;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: f */
    public final Parcelable mo920f() {
        SavedState savedState = new SavedState();
        savedState.f62838a = this.f62834a.getSelectedItemId();
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: a */
    public final void mo909a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            C26602c cVar = this.f62834a;
            int i = ((SavedState) parcelable).f62838a;
            int size = cVar.f62869h.size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = cVar.f62869h.getItem(i2);
                if (i == item.getItemId()) {
                    cVar.f62866e = i;
                    cVar.f62867f = i2;
                    item.setChecked(true);
                    return;
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: a */
    public final void mo895a(boolean z) {
        if (!this.f62835b) {
            if (z) {
                this.f62834a.mo43949b();
                return;
            }
            C26602c cVar = this.f62834a;
            if (!(cVar.f62869h == null || cVar.f62865d == null)) {
                int size = cVar.f62869h.size();
                if (size != cVar.f62865d.length) {
                    cVar.mo43949b();
                    return;
                }
                int i = cVar.f62866e;
                for (int i2 = 0; i2 < size; i2++) {
                    MenuItem item = cVar.f62869h.getItem(i2);
                    if (item.isChecked()) {
                        cVar.f62866e = item.getItemId();
                        cVar.f62867f = i2;
                    }
                }
                if (i != cVar.f62866e) {
                    C1142o.m3795a(cVar, cVar.f62862a);
                }
                boolean a = C26602c.m52749a(cVar.f62864c, cVar.f62869h.mo989i().size());
                for (int i3 = 0; i3 < size; i3++) {
                    cVar.f62868g.f62835b = true;
                    cVar.f62865d[i3].setLabelVisibilityMode(cVar.f62864c);
                    cVar.f62865d[i3].setShifting(a);
                    cVar.f62865d[i3].mo795a((C0306j) cVar.f62869h.getItem(i3));
                    cVar.f62868g.f62835b = false;
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: a */
    public final void mo891a(Context context, C0302h hVar) {
        this.f62837d = hVar;
        this.f62834a.f62869h = hVar;
    }
}
