package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.AbstractC0276c;
import androidx.core.p037h.C0792v;
import androidx.customview.view.AbsSavedState;
import androidx.p041d.p042a.AbstractC0833a;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends LinearLayoutCompat implements AbstractC0276c {

    /* renamed from: u */
    static final C0365a f1368u = new C0365a();

    /* renamed from: A */
    private Rect f1369A;

    /* renamed from: B */
    private int[] f1370B;

    /* renamed from: C */
    private int[] f1371C;

    /* renamed from: D */
    private final ImageView f1372D;

    /* renamed from: E */
    private final Drawable f1373E;

    /* renamed from: F */
    private final int f1374F;

    /* renamed from: G */
    private final int f1375G;

    /* renamed from: H */
    private final CharSequence f1376H;

    /* renamed from: I */
    private AbstractC0367c f1377I;

    /* renamed from: J */
    private AbstractC0366b f1378J;

    /* renamed from: K */
    private View.OnClickListener f1379K;

    /* renamed from: L */
    private CharSequence f1380L;

    /* renamed from: M */
    private boolean f1381M;

    /* renamed from: N */
    private int f1382N;

    /* renamed from: O */
    private boolean f1383O;

    /* renamed from: P */
    private CharSequence f1384P;

    /* renamed from: Q */
    private CharSequence f1385Q;

    /* renamed from: R */
    private boolean f1386R;

    /* renamed from: S */
    private int f1387S;

    /* renamed from: T */
    private final Runnable f1388T;

    /* renamed from: U */
    private Runnable f1389U;

    /* renamed from: V */
    private final WeakHashMap<String, Drawable.ConstantState> f1390V;

    /* renamed from: W */
    private final View.OnClickListener f1391W;

    /* renamed from: a */
    final SearchAutoComplete f1392a;

    /* renamed from: aa */
    private final TextView.OnEditorActionListener f1393aa;

    /* renamed from: ab */
    private final AdapterView.OnItemClickListener f1394ab;

    /* renamed from: ac */
    private final AdapterView.OnItemSelectedListener f1395ac;

    /* renamed from: ad */
    private TextWatcher f1396ad;

    /* renamed from: b */
    final View f1397b;

    /* renamed from: c */
    final ImageView f1398c;

    /* renamed from: d */
    final ImageView f1399d;

    /* renamed from: e */
    final ImageView f1400e;

    /* renamed from: h */
    final ImageView f1401h;

    /* renamed from: i */
    final View f1402i;

    /* renamed from: j */
    final Intent f1403j;

    /* renamed from: k */
    final Intent f1404k;

    /* renamed from: l */
    View.OnFocusChangeListener f1405l;

    /* renamed from: m */
    AbstractC0368d f1406m;

    /* renamed from: n */
    public boolean f1407n;

    /* renamed from: o */
    public boolean f1408o;

    /* renamed from: p */
    AbstractC0833a f1409p;

    /* renamed from: q */
    public boolean f1410q;

    /* renamed from: r */
    public boolean f1411r;

    /* renamed from: s */
    SearchableInfo f1412s;

    /* renamed from: t */
    Bundle f1413t;

    /* renamed from: v */
    View.OnKeyListener f1414v;

    /* renamed from: w */
    private final View f1415w;

    /* renamed from: x */
    private final View f1416x;

    /* renamed from: y */
    private C0369e f1417y;

    /* renamed from: z */
    private Rect f1418z;

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    public interface AbstractC0366b {
        static {
            Covode.recordClassIndex(427);
        }

        /* renamed from: a */
        boolean mo1545a();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    public interface AbstractC0367c {
        static {
            Covode.recordClassIndex(428);
        }

        /* renamed from: a */
        boolean mo1546a();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    public interface AbstractC0368d {
        static {
            Covode.recordClassIndex(429);
        }

        /* renamed from: a */
        boolean mo1547a();

        /* renamed from: b */
        boolean mo1548b();
    }

    public int getMaxWidth() {
        return this.f1382N;
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.f1375G;
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.f1374F;
    }

    public AbstractC0833a getSuggestionsAdapter() {
        return this.f1409p;
    }

    /* renamed from: m */
    private void m1358m() {
        post(this.f1388T);
    }

    public int getImeOptions() {
        return this.f1392a.getImeOptions();
    }

    public int getInputType() {
        return this.f1392a.getInputType();
    }

    public CharSequence getQuery() {
        return this.f1392a.getText();
    }

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class androidx.appcompat.widget.SearchView.SavedState.C03631 */

            static {
                Covode.recordClassIndex(423);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };

        /* renamed from: a */
        boolean f1429a;

        static {
            Covode.recordClassIndex(422);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1429a + "}";
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f1429a));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1429a = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    public static class SearchAutoComplete extends C0424d {

        /* renamed from: a */
        boolean f1430a;

        /* renamed from: b */
        final Runnable f1431b;

        /* renamed from: c */
        private int f1432c;

        /* renamed from: d */
        private SearchView f1433d;

        static {
            Covode.recordClassIndex(424);
        }

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        public boolean enoughToFilter() {
            if (this.f1432c <= 0 || super.enoughToFilter()) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i >= 600) {
                return 192;
            }
            if (i < 640 || i2 < 480) {
                return 160;
            }
            return 192;
        }

        /* access modifiers changed from: package-private */
        public void setSearchView(SearchView searchView) {
            this.f1433d = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f1432c = i;
        }

        @Override // androidx.appcompat.widget.C0424d
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1430a) {
                removeCallbacks(this.f1431b);
                post(this.f1431b);
            }
            return onCreateInputConnection;
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f1433d.hasFocus() && getVisibility() == 0) {
                this.f1430a = true;
                if (getContext().getResources().getConfiguration().orientation == 2) {
                    SearchView.f1368u.mo1544c(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) m1372a(getContext(), "input_method");
            if (!z) {
                this.f1430a = false;
                removeCallbacks(this.f1431b);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f1430a = false;
                removeCallbacks(this.f1431b);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f1430a = true;
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, (byte) 0);
        }

        /* renamed from: a */
        public static Object m1372a(Context context, String str) {
            Object systemService;
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!C58027i.f132247b && "connectivity".equals(str)) {
                    try {
                        new C21708b().mo35361a();
                        C58027i.f132247b = true;
                        return context.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                return context.getSystemService(str);
            } else if (!C58027i.f132246a) {
                return context.getSystemService(str);
            } else {
                synchronized (ClipboardManager.class) {
                    systemService = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(systemService, new C58027i.HandlerC58028a((Handler) declaredField.get(systemService)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                }
                return systemService;
            }
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1433d.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f1433d.mo1488h();
        }

        private SearchAutoComplete(Context context, AttributeSet attributeSet, byte b) {
            super(context, attributeSet, (byte) 0);
            this.f1431b = new Runnable() {
                /* class androidx.appcompat.widget.SearchView.SearchAutoComplete.RunnableC03641 */

                static {
                    Covode.recordClassIndex(425);
                }

                public final void run() {
                    SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                    if (searchAutoComplete.f1430a) {
                        ((InputMethodManager) SearchAutoComplete.m1372a(searchAutoComplete.getContext(), "input_method")).showSoftInput(searchAutoComplete, 0);
                        searchAutoComplete.f1430a = false;
                    }
                }
            };
            this.f1432c = getThreshold();
        }
    }

    static {
        Covode.recordClassIndex(411);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.ar);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.as);
    }

    /* renamed from: j */
    private boolean m1355j() {
        if ((this.f1410q || this.f1383O) && !this.f1408o) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo1489i() {
        C0365a aVar = f1368u;
        aVar.mo1542a(this.f1392a);
        aVar.mo1543b(this.f1392a);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f1388T);
        post(this.f1389U);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1429a = this.f1408o;
        return savedState;
    }

    /* renamed from: k */
    private void m1356k() {
        int i;
        if (!m1355j() || !(this.f1399d.getVisibility() == 0 || this.f1401h.getVisibility() == 0)) {
            i = 8;
        } else {
            i = 0;
        }
        this.f1416x.setVisibility(i);
    }

    /* renamed from: n */
    private void m1359n() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1392a;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m1351b(queryHint));
    }

    public void clearFocus() {
        this.f1381M = true;
        super.clearFocus();
        this.f1392a.clearFocus();
        this.f1392a.setImeVisibility(false);
        this.f1381M = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo1479g() {
        m1350a(false);
        this.f1392a.requestFocus();
        this.f1392a.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f1379K;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo1488h() {
        m1350a(this.f1408o);
        m1358m();
        if (this.f1392a.hasFocus()) {
            mo1489i();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.SearchView$a */
    public static class C0365a {

        /* renamed from: a */
        private Method f1435a;

        /* renamed from: b */
        private Method f1436b;

        /* renamed from: c */
        private Method f1437c;

        static {
            Covode.recordClassIndex(426);
        }

        C0365a() {
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1435a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1436b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f1437c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo1542a(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f1435a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo1543b(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f1436b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final void mo1544c(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f1437c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, true);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: l */
    private void m1357l() {
        int[] iArr;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1392a.getText());
        int i = 0;
        if (!z2 && (!this.f1407n || this.f1386R)) {
            z = false;
        }
        ImageView imageView = this.f1400e;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.f1400e.getDrawable();
        if (drawable != null) {
            if (z2) {
                iArr = ENABLED_STATE_SET;
            } else {
                iArr = EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo1476d() {
        int[] iArr;
        if (this.f1392a.hasFocus()) {
            iArr = FOCUSED_STATE_SET;
        } else {
            iArr = EMPTY_STATE_SET;
        }
        Drawable background = this.f1397b.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1416x.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo1477e() {
        Editable text = this.f1392a.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            AbstractC0367c cVar = this.f1377I;
            if (cVar != null) {
                text.toString();
                if (cVar.mo1546a()) {
                    return;
                }
            }
            if (this.f1412s != null) {
                mo1472a(text.toString());
            }
            this.f1392a.setImeVisibility(false);
            this.f1392a.dismissDropDown();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo1478f() {
        if (!TextUtils.isEmpty(this.f1392a.getText())) {
            this.f1392a.setText("");
            this.f1392a.requestFocus();
            this.f1392a.setImeVisibility(true);
        } else if (this.f1407n) {
            AbstractC0366b bVar = this.f1378J;
            if (bVar == null || !bVar.mo1545a()) {
                clearFocus();
                m1350a(true);
            }
        }
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1380L;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1412s;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.f1376H;
        }
        return getContext().getText(this.f1412s.getHintId());
    }

    @Override // androidx.appcompat.view.AbstractC0276c
    /* renamed from: b */
    public final void mo742b() {
        this.f1392a.setText("");
        SearchAutoComplete searchAutoComplete = this.f1392a;
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f1385Q = "";
        clearFocus();
        m1350a(true);
        this.f1392a.setImeOptions(this.f1387S);
        this.f1386R = false;
    }

    @Override // androidx.appcompat.view.AbstractC0276c
    /* renamed from: a */
    public final void mo741a() {
        if (!this.f1386R) {
            this.f1386R = true;
            int imeOptions = this.f1392a.getImeOptions();
            this.f1387S = imeOptions;
            this.f1392a.setImeOptions(imeOptions | 33554432);
            this.f1392a.setText("");
            setIconified(false);
        }
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1413t = bundle;
    }

    public void setOnCloseListener(AbstractC0366b bVar) {
        this.f1378J = bVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f1405l = onFocusChangeListener;
    }

    public void setOnQueryTextListener(AbstractC0367c cVar) {
        this.f1377I = cVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f1379K = onClickListener;
    }

    public void setOnSuggestionListener(AbstractC0368d dVar) {
        this.f1406m = dVar;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m1358m();
    }

    public void setImeOptions(int i) {
        this.f1392a.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f1392a.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f1382N = i;
        requestLayout();
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f1380L = charSequence;
        m1359n();
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f1410q = z;
        m1350a(this.f1408o);
    }

    public void setSuggestionsAdapter(AbstractC0833a aVar) {
        this.f1409p = aVar;
        this.f1392a.setAdapter(aVar);
    }

    /* renamed from: a */
    private void m1349a(Intent intent) {
        if (intent != null) {
            try {
                m1348a(getContext(), intent);
            } catch (RuntimeException unused) {
            }
        }
    }

    public void setIconified(boolean z) {
        if (z) {
            mo1478f();
        } else {
            mo1479g();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f1407n != z) {
            this.f1407n = z;
            m1350a(z);
            m1359n();
        }
    }

    /* renamed from: b */
    private void m1352b(boolean z) {
        int i;
        if (!this.f1410q || !m1355j() || !hasFocus() || (!z && this.f1383O)) {
            i = 8;
        } else {
            i = 0;
        }
        this.f1399d.setVisibility(i);
    }

    /* renamed from: c */
    private void m1353c(boolean z) {
        int i = 8;
        if (this.f1383O && !this.f1408o && z) {
            this.f1399d.setVisibility(8);
            i = 0;
        }
        this.f1401h.setVisibility(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo1472a(String str) {
        m1348a(getContext(), m1347a("android.intent.action.SEARCH", null, null, str, 0, null));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f3089d);
        m1350a(savedState.f1429a);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void setQuery(CharSequence charSequence) {
        int length;
        this.f1392a.setText(charSequence);
        SearchAutoComplete searchAutoComplete = this.f1392a;
        if (TextUtils.isEmpty(charSequence)) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        searchAutoComplete.setSelection(length);
    }

    public void setQueryRefinementEnabled(boolean z) {
        int i;
        this.f1411r = z;
        AbstractC0833a aVar = this.f1409p;
        if (aVar instanceof View$OnClickListenerC0399ag) {
            View$OnClickListenerC0399ag agVar = (View$OnClickListenerC0399ag) aVar;
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            agVar.f1546a = i;
        }
    }

    /* renamed from: b */
    private CharSequence m1351b(CharSequence charSequence) {
        if (!this.f1407n || this.f1373E == null) {
            return charSequence;
        }
        double textSize = (double) this.f1392a.getTextSize();
        Double.isNaN(textSize);
        int i = (int) (textSize * 1.25d);
        this.f1373E.setBounds(0, 0, i, i);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f1373E), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: c */
    private boolean m1354c(int i) {
        Cursor a = this.f1409p.mo3045a();
        if (a == null || !a.moveToPosition(i)) {
            return false;
        }
        m1349a(m1346a(a));
        return true;
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    static class C0369e extends TouchDelegate {

        /* renamed from: a */
        private final View f1438a;

        /* renamed from: b */
        private final Rect f1439b = new Rect();

        /* renamed from: c */
        private final Rect f1440c = new Rect();

        /* renamed from: d */
        private final Rect f1441d = new Rect();

        /* renamed from: e */
        private final int f1442e;

        /* renamed from: f */
        private boolean f1443f;

        static {
            Covode.recordClassIndex(430);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x005b, code lost:
            if (r7.f1441d.contains(r4, r3) == false) goto L_0x005d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
            if (1 != 0) goto L_0x002f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onTouchEvent(android.view.MotionEvent r8) {
            /*
            // Method dump skipped, instructions count: 109
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.C0369e.onTouchEvent(android.view.MotionEvent):boolean");
        }

        /* renamed from: a */
        public final void mo1549a(Rect rect, Rect rect2) {
            this.f1439b.set(rect);
            this.f1441d.set(rect);
            Rect rect3 = this.f1441d;
            int i = this.f1442e;
            rect3.inset(-i, -i);
            this.f1440c.set(rect2);
        }

        public C0369e(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1442e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            mo1549a(rect, rect2);
            this.f1438a = view;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:19|20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r12.getPosition();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0065, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0062 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.content.Intent m1346a(android.database.Cursor r12) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.m1346a(android.database.Cursor):android.content.Intent");
    }

    /* renamed from: a */
    private void m1350a(boolean z) {
        int i;
        int i2;
        this.f1408o = z;
        int i3 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        boolean z2 = !TextUtils.isEmpty(this.f1392a.getText());
        this.f1398c.setVisibility(i);
        m1352b(z2);
        View view = this.f1415w;
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        view.setVisibility(i2);
        if (this.f1372D.getDrawable() == null || this.f1407n) {
            i3 = 8;
        }
        this.f1372D.setVisibility(i3);
        m1357l();
        m1353c(!z2);
        m1356k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo1474b(int i) {
        AbstractC0368d dVar = this.f1406m;
        if (dVar != null && dVar.mo1548b()) {
            return false;
        }
        m1354c(i);
        this.f1392a.setImeVisibility(false);
        this.f1392a.dismissDropDown();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008f, code lost:
        if (getContext().getPackageManager().resolveActivity(r1, 65536) != null) goto L_0x0091;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
        // Method dump skipped, instructions count: 177
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo1471a(CharSequence charSequence) {
        Editable text = this.f1392a.getText();
        this.f1385Q = text;
        boolean z = !TextUtils.isEmpty(text);
        m1352b(z);
        m1353c(!z);
        m1357l();
        m1356k();
        if (this.f1377I != null && !TextUtils.equals(charSequence, this.f1384P)) {
            charSequence.toString();
        }
        this.f1384P = charSequence.toString();
    }

    /* renamed from: a */
    public static void m1348a(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ab0);
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.f1381M || !isFocusable()) {
            return false;
        }
        if (this.f1408o) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f1392a.requestFocus(i, rect);
        if (requestFocus) {
            m1350a(false);
        }
        return requestFocus;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public void onMeasure(int i, int i2) {
        int i3;
        if (this.f1408o) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.f1382N;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f1382N;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.f1382N) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo1473a(int i, KeyEvent keyEvent) {
        int i2;
        if (this.f1412s != null && this.f1409p != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return mo1474b(this.f1392a.getListSelection());
            }
            if (i == 21) {
                i2 = 0;
            } else if (i == 22) {
                i2 = this.f1392a.length();
            } else if (i != 19 || this.f1392a.getListSelection() == 0) {
                return false;
            }
            this.f1392a.setSelection(i2);
            this.f1392a.setListSelection(0);
            this.f1392a.clearListSelection();
            f1368u.mo1544c(this.f1392a);
            return true;
        }
        return false;
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1418z = new Rect();
        this.f1369A = new Rect();
        this.f1370B = new int[2];
        this.f1371C = new int[2];
        this.f1388T = new Runnable() {
            /* class androidx.appcompat.widget.SearchView.RunnableC03531 */

            static {
                Covode.recordClassIndex(412);
            }

            public final void run() {
                SearchView.this.mo1476d();
            }
        };
        this.f1389U = new Runnable() {
            /* class androidx.appcompat.widget.SearchView.RunnableC03563 */

            static {
                Covode.recordClassIndex(415);
            }

            public final void run() {
                if (SearchView.this.f1409p != null && (SearchView.this.f1409p instanceof View$OnClickListenerC0399ag)) {
                    SearchView.this.f1409p.mo1809a((Cursor) null);
                }
            }
        };
        this.f1390V = new WeakHashMap<>();
        View$OnClickListenerC03596 r14 = new View.OnClickListener() {
            /* class androidx.appcompat.widget.SearchView.View$OnClickListenerC03596 */

            static {
                Covode.recordClassIndex(418);
            }

            public final void onClick(View view) {
                String str;
                String str2;
                if (view == SearchView.this.f1398c) {
                    SearchView.this.mo1479g();
                } else if (view == SearchView.this.f1400e) {
                    SearchView.this.mo1478f();
                } else if (view == SearchView.this.f1399d) {
                    SearchView.this.mo1477e();
                } else if (view == SearchView.this.f1401h) {
                    SearchView searchView = SearchView.this;
                    if (searchView.f1412s != null) {
                        SearchableInfo searchableInfo = searchView.f1412s;
                        try {
                            String str3 = null;
                            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                                Intent intent = new Intent(searchView.f1403j);
                                ComponentName searchActivity = searchableInfo.getSearchActivity();
                                if (searchActivity != null) {
                                    str3 = searchActivity.flattenToShortString();
                                }
                                intent.putExtra("calling_package", str3);
                                SearchView.m1348a(searchView.getContext(), intent);
                            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                                Intent intent2 = searchView.f1404k;
                                ComponentName searchActivity2 = searchableInfo.getSearchActivity();
                                Intent intent3 = new Intent("android.intent.action.SEARCH");
                                intent3.setComponent(searchActivity2);
                                PendingIntent activity = PendingIntent.getActivity(searchView.getContext(), 0, intent3, 1073741824);
                                Bundle bundle = new Bundle();
                                if (searchView.f1413t != null) {
                                    bundle.putParcelable("app_data", searchView.f1413t);
                                }
                                Intent intent4 = new Intent(intent2);
                                String str4 = "free_form";
                                int i = 1;
                                Resources resources = searchView.getResources();
                                if (searchableInfo.getVoiceLanguageModeId() != 0) {
                                    str4 = resources.getString(searchableInfo.getVoiceLanguageModeId());
                                }
                                if (searchableInfo.getVoicePromptTextId() != 0) {
                                    str = resources.getString(searchableInfo.getVoicePromptTextId());
                                } else {
                                    str = null;
                                }
                                if (searchableInfo.getVoiceLanguageId() != 0) {
                                    str2 = resources.getString(searchableInfo.getVoiceLanguageId());
                                } else {
                                    str2 = null;
                                }
                                if (searchableInfo.getVoiceMaxResults() != 0) {
                                    i = searchableInfo.getVoiceMaxResults();
                                }
                                intent4.putExtra("android.speech.extra.LANGUAGE_MODEL", str4);
                                intent4.putExtra("android.speech.extra.PROMPT", str);
                                intent4.putExtra("android.speech.extra.LANGUAGE", str2);
                                intent4.putExtra("android.speech.extra.MAX_RESULTS", i);
                                if (searchActivity2 != null) {
                                    str3 = searchActivity2.flattenToShortString();
                                }
                                intent4.putExtra("calling_package", str3);
                                intent4.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
                                intent4.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
                                SearchView.m1348a(searchView.getContext(), intent4);
                            }
                        } catch (ActivityNotFoundException unused) {
                        }
                    }
                } else if (view == SearchView.this.f1392a) {
                    SearchView.this.mo1489i();
                }
            }
        };
        this.f1391W = r14;
        this.f1414v = new View.OnKeyListener() {
            /* class androidx.appcompat.widget.SearchView.View$OnKeyListenerC03607 */

            static {
                Covode.recordClassIndex(419);
            }

            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (SearchView.this.f1412s == null) {
                    return false;
                }
                if (SearchView.this.f1392a.isPopupShowing() && SearchView.this.f1392a.getListSelection() != -1) {
                    return SearchView.this.mo1473a(i, keyEvent);
                }
                if (TextUtils.getTrimmedLength(SearchView.this.f1392a.getText()) == 0 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                    return false;
                }
                view.cancelLongPress();
                SearchView searchView = SearchView.this;
                searchView.mo1472a(searchView.f1392a.getText().toString());
                return true;
            }
        };
        C03618 r13 = new TextView.OnEditorActionListener() {
            /* class androidx.appcompat.widget.SearchView.C03618 */

            static {
                Covode.recordClassIndex(420);
            }

            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                SearchView.this.mo1477e();
                return true;
            }
        };
        this.f1393aa = r13;
        C03629 r12 = new AdapterView.OnItemClickListener() {
            /* class androidx.appcompat.widget.SearchView.C03629 */

            static {
                Covode.recordClassIndex(421);
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                SearchView.this.mo1474b(i);
            }
        };
        this.f1394ab = r12;
        C035410 r11 = new AdapterView.OnItemSelectedListener() {
            /* class androidx.appcompat.widget.SearchView.C035410 */

            static {
                Covode.recordClassIndex(413);
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onNothingSelected(AdapterView<?> adapterView) {
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                SearchView searchView = SearchView.this;
                if (searchView.f1406m == null || !searchView.f1406m.mo1547a()) {
                    Editable text = searchView.f1392a.getText();
                    Cursor a = searchView.f1409p.mo3045a();
                    if (a == null) {
                        return;
                    }
                    if (a.moveToPosition(i)) {
                        CharSequence b = searchView.f1409p.mo1811b(a);
                        if (b != null) {
                            searchView.setQuery(b);
                        } else {
                            searchView.setQuery(text);
                        }
                    } else {
                        searchView.setQuery(text);
                    }
                }
            }
        };
        this.f1395ac = r11;
        this.f1396ad = new TextWatcher() {
            /* class androidx.appcompat.widget.SearchView.C03552 */

            static {
                Covode.recordClassIndex(414);
            }

            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                SearchView.this.mo1471a(charSequence);
            }
        };
        C0405al a = C0405al.m1466a(context, attributeSet, new int[]{16842970, 16843039, 16843296, 16843364, R.attr.nv, R.attr.pe, R.attr.r4, R.attr.v2, R.attr.w6, R.attr.z9, R.attr.a8j, R.attr.a8k, R.attr.aay, R.attr.aaz, R.attr.afu, R.attr.ag0, R.attr.at4}, i, 0);
        C1764a.m5927a(LayoutInflater.from(context), a.mo1838g(9, R.layout.aq), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.dsj);
        this.f1392a = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1415w = findViewById(R.id.drk);
        View findViewById = findViewById(R.id.dsd);
        this.f1397b = findViewById;
        View findViewById2 = findViewById(R.id.eaj);
        this.f1416x = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.dr9);
        this.f1398c = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.drs);
        this.f1399d = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.dre);
        this.f1400e = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.dsy);
        this.f1401h = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.ds4);
        this.f1372D = imageView5;
        C0792v.m2746a(findViewById, a.mo1826a(10));
        C0792v.m2746a(findViewById2, a.mo1826a(14));
        imageView.setImageDrawable(a.mo1826a(13));
        imageView2.setImageDrawable(a.mo1826a(7));
        imageView3.setImageDrawable(a.mo1826a(4));
        imageView4.setImageDrawable(a.mo1826a(16));
        imageView5.setImageDrawable(a.mo1826a(13));
        this.f1373E = a.mo1826a(12);
        C0409an.m1520a(imageView, getResources().getString(R.string.m4));
        this.f1374F = a.mo1838g(15, R.layout.ap);
        this.f1375G = a.mo1838g(5, 0);
        imageView.setOnClickListener(r14);
        imageView3.setOnClickListener(r14);
        imageView2.setOnClickListener(r14);
        imageView4.setOnClickListener(r14);
        searchAutoComplete.setOnClickListener(r14);
        searchAutoComplete.addTextChangedListener(this.f1396ad);
        searchAutoComplete.setOnEditorActionListener(r13);
        searchAutoComplete.setOnItemClickListener(r12);
        searchAutoComplete.setOnItemSelectedListener(r11);
        searchAutoComplete.setOnKeyListener(this.f1414v);
        searchAutoComplete.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class androidx.appcompat.widget.SearchView.View$OnFocusChangeListenerC03574 */

            static {
                Covode.recordClassIndex(416);
            }

            public final void onFocusChange(View view, boolean z) {
                if (SearchView.this.f1405l != null) {
                    SearchView.this.f1405l.onFocusChange(SearchView.this, z);
                }
            }
        });
        setIconifiedByDefault(a.mo1827a(8, true));
        int e = a.mo1834e(1, -1);
        if (e != -1) {
            setMaxWidth(e);
        }
        this.f1376H = a.mo1831c(6);
        this.f1380L = a.mo1831c(11);
        int a2 = a.mo1824a(3, -1);
        if (a2 != -1) {
            setImeOptions(a2);
        }
        int a3 = a.mo1824a(2, -1);
        if (a3 != -1) {
            setInputType(a3);
        }
        setFocusable(a.mo1827a(0, true));
        a.f1585a.recycle();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f1403j = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f1404k = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f1402i = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                /* class androidx.appcompat.widget.SearchView.View$OnLayoutChangeListenerC03585 */

                static {
                    Covode.recordClassIndex(417);
                }

                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    int i9;
                    int i10;
                    SearchView searchView = SearchView.this;
                    if (searchView.f1402i.getWidth() > 1) {
                        Resources resources = searchView.getContext().getResources();
                        int paddingLeft = searchView.f1397b.getPaddingLeft();
                        Rect rect = new Rect();
                        boolean a = C0415ar.m1540a(searchView);
                        if (searchView.f1407n) {
                            i9 = resources.getDimensionPixelSize(R.dimen.ah) + resources.getDimensionPixelSize(R.dimen.ai);
                        } else {
                            i9 = 0;
                        }
                        searchView.f1392a.getDropDownBackground().getPadding(rect);
                        if (a) {
                            i10 = -rect.left;
                        } else {
                            i10 = paddingLeft - (rect.left + i9);
                        }
                        searchView.f1392a.setDropDownHorizontalOffset(i10);
                        searchView.f1392a.setDropDownWidth((((searchView.f1402i.getWidth() + rect.left) + rect.right) + i9) - paddingLeft);
                    }
                }
            });
        }
        m1350a(this.f1407n);
        m1359n();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.f1392a;
            Rect rect = this.f1418z;
            searchAutoComplete.getLocationInWindow(this.f1370B);
            getLocationInWindow(this.f1371C);
            int[] iArr = this.f1370B;
            int i5 = iArr[1];
            int[] iArr2 = this.f1371C;
            int i6 = i5 - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            rect.set(i7, i6, searchAutoComplete.getWidth() + i7, searchAutoComplete.getHeight() + i6);
            this.f1369A.set(this.f1418z.left, 0, this.f1418z.right, i4 - i2);
            C0369e eVar = this.f1417y;
            if (eVar == null) {
                C0369e eVar2 = new C0369e(this.f1369A, this.f1418z, this.f1392a);
                this.f1417y = eVar2;
                setTouchDelegate(eVar2);
                return;
            }
            eVar.mo1549a(this.f1369A, this.f1418z);
        }
    }

    /* renamed from: a */
    private Intent m1347a(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1385Q);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1413t;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f1412s.getSearchActivity());
        return intent;
    }
}
