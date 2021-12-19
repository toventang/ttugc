package com.bytedance.ies.uikit.tabhost;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;

public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    /* renamed from: a */
    private boolean f43624a;

    /* renamed from: b */
    private final ArrayList<C18282c> f43625b = new ArrayList<>();

    /* renamed from: c */
    private FrameLayout f43626c;

    /* renamed from: d */
    private Context f43627d;

    /* renamed from: e */
    private AbstractC0952i f43628e;

    /* renamed from: f */
    private int f43629f;

    /* renamed from: g */
    private TabHost.OnTabChangeListener f43630g;

    /* renamed from: h */
    private C18282c f43631h;

    /* renamed from: i */
    private boolean f43632i;

    /* renamed from: j */
    private AbstractC18281b f43633j;

    /* renamed from: k */
    private boolean f43634k = false;

    /* renamed from: l */
    private boolean f43635l = false;

    /* renamed from: com.bytedance.ies.uikit.tabhost.FragmentTabHost$b */
    public interface AbstractC18281b {
        static {
            Covode.recordClassIndex(20951);
        }

        /* renamed from: a */
        void mo29236a(String str, Fragment fragment, Fragment fragment2);
    }

    static {
        Covode.recordClassIndex(20947);
    }

    public boolean getDispatchWindowFocusChangedToAllTab() {
        return this.f43624a;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f43632i = false;
    }

    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class com.bytedance.ies.uikit.tabhost.FragmentTabHost.SavedState.C182791 */

            static {
                Covode.recordClassIndex(20949);
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
        String f43636a;

        static {
            Covode.recordClassIndex(20948);
        }

        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.f43636a + "}";
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f43636a = parcel.readString();
        }

        /* synthetic */ SavedState(Parcel parcel, byte b) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f43636a);
        }
    }

    public Fragment getCurrentFragment() {
        C18282c cVar = this.f43631h;
        if (cVar != null) {
            return cVar.f43641d;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f43636a = getCurrentTabTag();
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            String currentTabTag = getCurrentTabTag();
            AbstractC0976n nVar = null;
            for (int i = 0; i < this.f43625b.size(); i++) {
                C18282c cVar = this.f43625b.get(i);
                cVar.f43641d = this.f43628e.mo3551a(cVar.f43638a);
                if (cVar.f43641d != null && !cVar.f43641d.isDetached()) {
                    if (cVar.f43638a.equals(currentTabTag)) {
                        this.f43631h = cVar;
                    } else {
                        if (nVar == null) {
                            nVar = this.f43628e.mo3552a();
                        }
                        nVar.mo3475d(cVar.f43641d);
                    }
                }
            }
            this.f43632i = true;
            AbstractC0976n a = m33992a(currentTabTag, nVar);
            if (a != null) {
                a.mo3473c();
                this.f43628e.mo3560b();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onFinishInflate() {
        MethodCollector.m26663i(13181);
        super.onFinishInflate();
        Context context = getContext();
        if (context == null) {
            MethodCollector.m26664o(13181);
            return;
        }
        if (findViewById(16908307) == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(16908307);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(16908305);
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(0, 0, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f43626c = frameLayout2;
            frameLayout2.setId(this.f43629f);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
        MethodCollector.m26664o(13181);
    }

    public void setDispatchWindowFocusChangedToAllTab(boolean z) {
        this.f43624a = z;
    }

    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.f43630g = onTabChangeListener;
    }

    public void setOnTabSwitchListener(AbstractC18281b bVar) {
        this.f43633j = bVar;
    }

    public void setSuperOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        super.setOnTabChangedListener(onTabChangeListener);
    }

    /* renamed from: com.bytedance.ies.uikit.tabhost.FragmentTabHost$a */
    static class C18280a implements TabHost.TabContentFactory {

        /* renamed from: a */
        private final Context f43637a;

        static {
            Covode.recordClassIndex(20950);
        }

        public C18280a(Context context) {
            this.f43637a = context;
        }

        public final View createTabContent(String str) {
            MethodCollector.m26663i(13938);
            View view = new View(this.f43637a);
            view.setMinimumWidth(0);
            view.setMinimumHeight(0);
            MethodCollector.m26664o(13938);
            return view;
        }
    }

    public void setHideWhenTabChanged(boolean z) {
        if (!this.f43635l) {
            this.f43634k = z;
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f43636a);
    }

    public FragmentTabHost(Context context) {
        super(context, null);
        MethodCollector.m26663i(13029);
        m33993a(context, (AttributeSet) null);
        MethodCollector.m26664o(13029);
    }

    public void dispatchWindowFocusChanged(boolean z) {
        if (this.f43624a) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchWindowFocusChanged(z);
            }
            return;
        }
        super.dispatchWindowFocusChanged(z);
    }

    public View getChildAt(int i) {
        MethodCollector.m26663i(13248);
        View childAt = super.getChildAt(i);
        FrameLayout frameLayout = childAt;
        if (childAt == null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            frameLayout2.setVisibility(8);
            frameLayout = frameLayout2;
        }
        MethodCollector.m26664o(13248);
        return frameLayout;
    }

    public void onTabChanged(String str) {
        Fragment fragment;
        Fragment fragment2 = null;
        if (this.f43632i) {
            C18282c cVar = this.f43631h;
            if (cVar != null) {
                fragment = cVar.f43641d;
            } else {
                fragment = null;
            }
            AbstractC0976n a = m33992a(str, (AbstractC0976n) null);
            if (a != null) {
                a.mo3473c();
            }
        } else {
            fragment = null;
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f43630g;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
        if (this.f43633j != null) {
            C18282c cVar2 = this.f43631h;
            if (cVar2 != null) {
                fragment2 = cVar2.f43641d;
            }
            if (fragment2 != fragment) {
                this.f43633j.mo29236a(str, fragment2, fragment);
            }
        }
    }

    /* renamed from: a */
    private void m33993a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.f43629f = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(13112);
        m33993a(context, attributeSet);
        MethodCollector.m26664o(13112);
    }

    /* renamed from: a */
    public final void mo29213a(Context context, AbstractC0952i iVar) {
        super.setup();
        this.f43627d = context;
        this.f43628e = iVar;
        this.f43629f = R.id.edy;
        if (this.f43626c == null) {
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.edy);
            this.f43626c = frameLayout;
            if (frameLayout == null) {
                throw new IllegalStateException("No tab content FrameLayout found for id " + this.f43629f);
            }
        }
        this.f43626c.setId(R.id.edy);
        if (getId() == -1) {
            setId(16908306);
        }
    }

    /* renamed from: a */
    private AbstractC0976n m33992a(String str, AbstractC0976n nVar) {
        this.f43635l = true;
        C18282c cVar = null;
        for (int i = 0; i < this.f43625b.size(); i++) {
            C18282c cVar2 = this.f43625b.get(i);
            if (cVar2.f43638a.equals(str)) {
                cVar = cVar2;
            }
        }
        if (cVar == null) {
            return null;
        }
        if (this.f43631h != cVar) {
            if (nVar == null) {
                nVar = this.f43628e.mo3552a();
            }
            C18282c cVar3 = this.f43631h;
            if (!(cVar3 == null || cVar3.f43641d == null)) {
                if (this.f43634k) {
                    nVar.mo3471b(this.f43631h.f43641d);
                } else {
                    nVar.mo3475d(this.f43631h.f43641d);
                }
            }
            if (cVar.f43641d == null) {
                cVar.f43641d = Fragment.instantiate(this.f43627d, cVar.f43639b.getName(), cVar.f43640c);
                nVar.mo3454a(this.f43629f, cVar.f43641d, cVar.f43638a);
            } else if (this.f43634k) {
                if (cVar.f43641d.isDetached()) {
                    nVar.mo3477e(cVar.f43641d);
                }
                nVar.mo3474c(cVar.f43641d);
            } else {
                nVar.mo3477e(cVar.f43641d);
            }
            this.f43631h = cVar;
        }
        return nVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.uikit.tabhost.FragmentTabHost$c */
    public static final class C18282c {

        /* renamed from: a */
        public final String f43638a;

        /* renamed from: b */
        public final Class<?> f43639b;

        /* renamed from: c */
        public Bundle f43640c;

        /* renamed from: d */
        public Fragment f43641d;

        static {
            Covode.recordClassIndex(20952);
        }

        C18282c(String str, Class<?> cls, Bundle bundle) {
            this.f43638a = str;
            this.f43639b = cls;
            this.f43640c = bundle;
        }
    }

    /* renamed from: a */
    public final void mo29214a(TabHost.TabSpec tabSpec, Class<?> cls, Bundle bundle) {
        tabSpec.setContent(new C18280a(this.f43627d));
        String tag = tabSpec.getTag();
        C18282c cVar = new C18282c(tag, cls, bundle);
        if (this.f43632i) {
            cVar.f43641d = this.f43628e.mo3551a(tag);
            if (cVar.f43641d != null && !cVar.f43641d.isDetached()) {
                AbstractC0976n a = this.f43628e.mo3552a();
                a.mo3475d(cVar.f43641d);
                a.mo3473c();
            }
        }
        this.f43625b.add(cVar);
        addTab(tabSpec);
    }
}
