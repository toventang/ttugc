package com.p2082ss.android.ugc.aweme.common.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.common.widget.AbstractLoadingLayout */
public class AbstractLoadingLayout extends FrameLayout {

    /* renamed from: a */
    protected View f92390a;

    /* renamed from: b */
    protected View f92391b;

    /* renamed from: c */
    protected View f92392c;

    /* renamed from: d */
    protected View f92393d;

    /* renamed from: e */
    protected int f92394e;

    /* renamed from: f */
    private AbstractC39172a f92395f;

    /* renamed from: com.ss.android.ugc.aweme.common.widget.AbstractLoadingLayout$a */
    public interface AbstractC39172a {
        static {
            Covode.recordClassIndex(46797);
        }
    }

    static {
        Covode.recordClassIndex(46794);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo67948a(Context context, AttributeSet attributeSet, int i) {
        return null;
    }

    /* renamed from: a */
    public void mo67949a(int i, int i2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public View mo67951b(Context context, AttributeSet attributeSet, int i) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public View mo67952c(Context context, AttributeSet attributeSet, int i) {
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.AbstractLoadingLayout$SavedState */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class com.p2082ss.android.ugc.aweme.common.widget.AbstractLoadingLayout.SavedState.C391711 */

            static {
                Covode.recordClassIndex(46796);
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
        int f92396a;

        static {
            Covode.recordClassIndex(46795);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f92396a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f92396a);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f92396a = this.f92394e;
        return savedState;
    }

    public final void setListener(AbstractC39172a aVar) {
        this.f92395f = aVar;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        setState(savedState.f92396a);
        super.onRestoreInstanceState(savedState.getSuperState());
    }

    public final void setState(int i) {
        if (i == 0 || i == 1 || i == 3 || i == 2) {
            int i2 = this.f92394e;
            if (i2 != i) {
                this.f92394e = i;
                mo67949a(i2, i);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("state must be one of STATE_OK, STATE_LOADING, STATE_EMPTY and STATE_ERROR.");
    }

    public AbstractLoadingLayout(Context context, AttributeSet attributeSet) {
        super(context, null, 0);
        MethodCollector.m26663i(14042);
        this.f92391b = mo67948a(context, null, 0);
        this.f92392c = mo67951b(context, null, 0);
        this.f92393d = mo67952c(context, null, 0);
        View view = this.f92391b;
        if (view != null) {
            addView(view);
        }
        View view2 = this.f92392c;
        if (view2 != null) {
            addView(view2);
        }
        View view3 = this.f92393d;
        if (view3 != null) {
            addView(view3);
        }
        setState(0);
        MethodCollector.m26664o(14042);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        MethodCollector.m26663i(14067);
        if (view == this.f92391b || view == this.f92392c || view == this.f92393d) {
            super.addView(view, i, layoutParams);
            MethodCollector.m26664o(14067);
        } else if (getChildCount() <= 4) {
            super.addView(view, i, layoutParams);
            this.f92390a = view;
            MethodCollector.m26664o(14067);
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("LoadingLayout can only contain one direct custom child.");
            MethodCollector.m26664o(14067);
            throw illegalArgumentException;
        }
    }
}
