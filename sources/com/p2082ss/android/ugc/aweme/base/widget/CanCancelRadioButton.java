package com.p2082ss.android.ugc.aweme.base.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RadioGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtRadioButton;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.base.widget.CanCancelRadioButton */
public class CanCancelRadioButton extends DmtRadioButton {

    /* renamed from: a */
    public boolean f82025a = true;

    /* renamed from: b */
    public List<AbstractC34737a> f82026b = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.base.widget.CanCancelRadioButton$a */
    public interface AbstractC34737a {
        static {
            Covode.recordClassIndex(41731);
        }

        /* renamed from: a */
        boolean mo61407a(View view);
    }

    static {
        Covode.recordClassIndex(41728);
    }

    /* renamed from: com.ss.android.ugc.aweme.base.widget.CanCancelRadioButton$SavedState */
    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class com.p2082ss.android.ugc.aweme.base.widget.CanCancelRadioButton.SavedState.C347361 */

            static {
                Covode.recordClassIndex(41730);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (byte) 0);
            }
        };

        /* renamed from: a */
        boolean f82027a;

        static {
            Covode.recordClassIndex(41729);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f82027a = z;
        }

        /* synthetic */ SavedState(Parcel parcel, byte b) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f82027a ? 1 : 0);
        }
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f82027a = this.f82025a;
        return savedState;
    }

    public void toggle() {
        for (AbstractC34737a aVar : this.f82026b) {
            if (!aVar.mo61407a(this)) {
                return;
            }
        }
        if (this.f82025a) {
            setChecked(!isChecked());
            if (!isChecked()) {
                ((RadioGroup) getParent()).clearCheck();
            }
        }
    }

    public void setCanChecked(boolean z) {
        this.f82025a = z;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCanChecked(savedState.f82027a);
    }

    public CanCancelRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
