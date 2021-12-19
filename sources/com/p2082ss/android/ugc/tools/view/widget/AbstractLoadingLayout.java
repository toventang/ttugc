package com.p2082ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.tools.view.widget.AbstractLoadingLayout */
public class AbstractLoadingLayout extends FrameLayout {

    /* renamed from: a */
    private AbstractC84990a f190053a;

    /* renamed from: e */
    protected View f190054e;

    /* renamed from: f */
    protected View f190055f;

    /* renamed from: g */
    protected View f190056g;

    /* renamed from: h */
    protected View f190057h;

    /* renamed from: i */
    protected int f190058i;

    /* renamed from: com.ss.android.ugc.tools.view.widget.AbstractLoadingLayout$a */
    public interface AbstractC84990a {
        static {
            Covode.recordClassIndex(99002);
        }
    }

    static {
        Covode.recordClassIndex(98999);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo86218a(Context context) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo78403a(Context context, AttributeSet attributeSet) {
        return null;
    }

    /* renamed from: a */
    public void mo78404a(int i, int i2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public View mo86220b(Context context) {
        return null;
    }

    /* renamed from: com.ss.android.ugc.tools.view.widget.AbstractLoadingLayout$SavedState */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class com.p2082ss.android.ugc.tools.view.widget.AbstractLoadingLayout.SavedState.C849891 */

            static {
                Covode.recordClassIndex(99001);
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
        int f190059a;

        static {
            Covode.recordClassIndex(99000);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f190059a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f190059a);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f190059a = this.f190058i;
        return savedState;
    }

    public final void setListener(AbstractC84990a aVar) {
        this.f190053a = aVar;
    }

    public AbstractLoadingLayout(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        setState(savedState.f190059a);
        super.onRestoreInstanceState(savedState.getSuperState());
    }

    public final void setState(int i) {
        if (i == 0 || i == 1 || i == 3 || i == 2) {
            int i2 = this.f190058i;
            if (i2 != i) {
                this.f190058i = i;
                mo78404a(i2, i);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("state must be one of STATE_OK, STATE_LOADING, STATE_EMPTY and STATE_ERROR.");
    }

    public AbstractLoadingLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private AbstractLoadingLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(9823);
        this.f190055f = mo78403a(context, attributeSet);
        this.f190056g = mo86218a(context);
        this.f190057h = mo86220b(context);
        View view = this.f190055f;
        if (view != null) {
            addView(view);
        }
        View view2 = this.f190056g;
        if (view2 != null) {
            addView(view2);
        }
        View view3 = this.f190057h;
        if (view3 != null) {
            addView(view3);
        }
        setState(0);
        MethodCollector.m26664o(9823);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        MethodCollector.m26663i(10122);
        if (view == this.f190055f || view == this.f190056g || view == this.f190057h) {
            super.addView(view, i, layoutParams);
            MethodCollector.m26664o(10122);
        } else if (getChildCount() <= 4) {
            super.addView(view, i, layoutParams);
            this.f190054e = view;
            MethodCollector.m26664o(10122);
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("LoadingLayout can only contain one direct custom child.");
            MethodCollector.m26664o(10122);
            throw illegalArgumentException;
        }
    }
}
