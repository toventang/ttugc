package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0211a;
import androidx.appcompat.p017a.p018a.C0196a;
import androidx.appcompat.view.AbstractC0276c;
import androidx.appcompat.view.C0281g;
import androidx.appcompat.view.menu.AbstractC0318o;
import androidx.appcompat.view.menu.C0302h;
import androidx.appcompat.view.menu.C0306j;
import androidx.appcompat.view.menu.SubMenuC0328u;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.p037h.C0774e;
import androidx.core.p037h.C0778h;
import androidx.core.p037h.C0792v;
import androidx.customview.view.AbsSavedState;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

public class Toolbar extends ViewGroup {
    private AbstractC0318o.AbstractC0319a mActionMenuPresenterCallback;
    int mButtonGravity;
    ImageButton mCollapseButtonView;
    private CharSequence mCollapseDescription;
    private Drawable mCollapseIcon;
    private boolean mCollapsible;
    private int mContentInsetEndWithActions;
    private int mContentInsetStartWithNavigation;
    private C0394ae mContentInsets;
    private boolean mEatingHover;
    private boolean mEatingTouch;
    View mExpandedActionView;
    private C0375a mExpandedMenuPresenter;
    private int mGravity;
    private final ArrayList<View> mHiddenViews;
    private ImageView mLogoView;
    private int mMaxButtonHeight;
    private C0302h.AbstractC0303a mMenuBuilderCallback;
    private ActionMenuView mMenuView;
    private final ActionMenuView.AbstractC0348e mMenuViewItemClickListener;
    private ImageButton mNavButtonView;
    AbstractC0377c mOnMenuItemClickListener;
    private ActionMenuPresenter mOuterActionMenuPresenter;
    private Context mPopupContext;
    private int mPopupTheme;
    private final Runnable mShowOverflowMenuRunnable;
    private CharSequence mSubtitleText;
    private int mSubtitleTextAppearance;
    private int mSubtitleTextColor;
    private TextView mSubtitleTextView;
    private final int[] mTempMargins;
    private final ArrayList<View> mTempViews;
    private int mTitleMarginBottom;
    private int mTitleMarginEnd;
    private int mTitleMarginStart;
    private int mTitleMarginTop;
    private CharSequence mTitleText;
    private int mTitleTextAppearance;
    private int mTitleTextColor;
    private TextView mTitleTextView;
    private C0406am mWrapper;

    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    public interface AbstractC0377c {
        static {
            Covode.recordClassIndex(441);
        }

        boolean onMenuItemClick(MenuItem menuItem);
    }

    static {
        Covode.recordClassIndex(433);
    }

    /* access modifiers changed from: package-private */
    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.mOuterActionMenuPresenter;
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.mPopupContext;
    }

    public int getPopupTheme() {
        return this.mPopupTheme;
    }

    public CharSequence getSubtitle() {
        return this.mSubtitleText;
    }

    public CharSequence getTitle() {
        return this.mTitleText;
    }

    public int getTitleMarginBottom() {
        return this.mTitleMarginBottom;
    }

    public int getTitleMarginEnd() {
        return this.mTitleMarginEnd;
    }

    public int getTitleMarginStart() {
        return this.mTitleMarginStart;
    }

    public int getTitleMarginTop() {
        return this.mTitleMarginTop;
    }

    public void dismissPopupMenus() {
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            actionMenuView.mo1295b();
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class androidx.appcompat.widget.Toolbar.SavedState.C03741 */

            static {
                Covode.recordClassIndex(438);
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
        int f1447a;

        /* renamed from: b */
        boolean f1448b;

        static {
            Covode.recordClassIndex(437);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1447a);
            parcel.writeInt(this.f1448b ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            boolean z;
            this.f1447a = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f1448b = z;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    public static class C0376b extends AbstractC0211a.C0212a {

        /* renamed from: b */
        int f1452b;

        static {
            Covode.recordClassIndex(440);
        }

        public C0376b() {
            this.f637a = 8388627;
        }

        public C0376b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0376b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public C0376b(AbstractC0211a.C0212a aVar) {
            super(aVar);
        }

        public C0376b(C0376b bVar) {
            super((AbstractC0211a.C0212a) bVar);
            this.f1452b = bVar.f1452b;
        }

        public C0376b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    private void ensureContentInsets() {
        if (this.mContentInsets == null) {
            this.mContentInsets = new C0394ae();
        }
    }

    private void ensureLogoView() {
        if (this.mLogoView == null) {
            this.mLogoView = new AppCompatImageView(getContext());
        }
    }

    private MenuInflater getMenuInflater() {
        return new C0281g(getContext());
    }

    private void postShowOverflowMenu() {
        removeCallbacks(this.mShowOverflowMenuRunnable);
        post(this.mShowOverflowMenuRunnable);
    }

    public void collapseActionView() {
        C0306j jVar;
        C0375a aVar = this.mExpandedMenuPresenter;
        if (aVar != null && (jVar = aVar.f1450b) != null) {
            jVar.collapseActionView();
        }
    }

    /* access modifiers changed from: protected */
    public C0376b generateDefaultLayoutParams() {
        return new C0376b();
    }

    public int getContentInsetEnd() {
        C0394ae aeVar = this.mContentInsets;
        if (aeVar == null) {
            return 0;
        }
        if (aeVar.f1526g) {
            return aeVar.f1520a;
        }
        return aeVar.f1521b;
    }

    public int getContentInsetEndWithActions() {
        int i = this.mContentInsetEndWithActions;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0394ae aeVar = this.mContentInsets;
        if (aeVar != null) {
            return aeVar.f1520a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0394ae aeVar = this.mContentInsets;
        if (aeVar != null) {
            return aeVar.f1521b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0394ae aeVar = this.mContentInsets;
        if (aeVar == null) {
            return 0;
        }
        if (aeVar.f1526g) {
            return aeVar.f1521b;
        }
        return aeVar.f1520a;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.mContentInsetStartWithNavigation;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        ensureMenu();
        return this.mMenuView.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public Drawable getOverflowIcon() {
        ensureMenu();
        return this.mMenuView.getOverflowIcon();
    }

    public AbstractC0454v getWrapper() {
        if (this.mWrapper == null) {
            this.mWrapper = new C0406am(this, true);
        }
        return this.mWrapper;
    }

    public boolean hasExpandedActionView() {
        C0375a aVar = this.mExpandedMenuPresenter;
        if (aVar == null || aVar.f1450b == null) {
            return false;
        }
        return true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.mShowOverflowMenuRunnable);
    }

    /* access modifiers changed from: package-private */
    public void addChildrenForExpandedActionView() {
        for (int size = this.mHiddenViews.size() - 1; size >= 0; size--) {
            addView(this.mHiddenViews.get(size));
        }
        this.mHiddenViews.clear();
    }

    public boolean canShowOverflowMenu() {
        ActionMenuView actionMenuView;
        if (getVisibility() != 0 || (actionMenuView = this.mMenuView) == null || !actionMenuView.f1284b) {
            return false;
        }
        return true;
    }

    public int getCurrentContentInsetLeft() {
        if (C0792v.m2768e(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (C0792v.m2768e(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.mContentInsetStartWithNavigation, 0));
        }
        return getContentInsetStart();
    }

    public boolean hideOverflowMenu() {
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView == null || actionMenuView.f1285c == null || !actionMenuView.f1285c.mo1279g()) {
            return false;
        }
        return true;
    }

    public boolean isOverflowMenuShowPending() {
        ActionMenuView actionMenuView = this.mMenuView;
        if (!(actionMenuView == null || actionMenuView.f1285c == null)) {
            ActionMenuPresenter actionMenuPresenter = actionMenuView.f1285c;
            if (actionMenuPresenter.f1261p != null || actionMenuPresenter.mo1282j()) {
                return true;
            }
        }
        return false;
    }

    public boolean isOverflowMenuShowing() {
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView == null || actionMenuView.f1285c == null || !actionMenuView.f1285c.mo1282j()) {
            return false;
        }
        return true;
    }

    public boolean isTitleTruncated() {
        Layout layout;
        TextView textView = this.mTitleTextView;
        if (textView == null || (layout = textView.getLayout()) == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i = 0; i < lineCount; i++) {
            if (layout.getEllipsisCount(i) > 0) {
                return true;
            }
        }
        return false;
    }

    public boolean showOverflowMenu() {
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView == null || actionMenuView.f1285c == null || !actionMenuView.f1285c.mo1278e()) {
            return false;
        }
        return true;
    }

    private void ensureMenu() {
        ensureMenuView();
        if (this.mMenuView.f1283a == null) {
            C0302h hVar = (C0302h) this.mMenuView.getMenu();
            if (this.mExpandedMenuPresenter == null) {
                this.mExpandedMenuPresenter = new C0375a();
            }
            this.mMenuView.setExpandedActionViewsExclusive(true);
            hVar.mo955a(this.mExpandedMenuPresenter, this.mPopupContext);
        }
    }

    private void ensureMenuView() {
        if (this.mMenuView == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.mMenuView = actionMenuView;
            actionMenuView.setPopupTheme(this.mPopupTheme);
            this.mMenuView.setOnMenuItemClickListener(this.mMenuViewItemClickListener);
            this.mMenuView.mo1293a(this.mActionMenuPresenterCallback, this.mMenuBuilderCallback);
            C0376b generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f637a = 8388613 | (this.mButtonGravity & 112);
            this.mMenuView.setLayoutParams(generateDefaultLayoutParams);
            addSystemView(this.mMenuView, false);
        }
    }

    private void ensureNavButtonView() {
        if (this.mNavButtonView == null) {
            this.mNavButtonView = new AppCompatImageButton(getContext(), null, R.attr.ajb);
            C0376b generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f637a = 8388611 | (this.mButtonGravity & 112);
            this.mNavButtonView.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    private boolean shouldCollapse() {
        if (!this.mCollapsible) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (shouldLayout(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void ensureCollapseButtonView() {
        if (this.mCollapseButtonView == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, R.attr.ajb);
            this.mCollapseButtonView = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.mCollapseIcon);
            this.mCollapseButtonView.setContentDescription(this.mCollapseDescription);
            C0376b generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f637a = 8388611 | (this.mButtonGravity & 112);
            generateDefaultLayoutParams.f1452b = 2;
            this.mCollapseButtonView.setLayoutParams(generateDefaultLayoutParams);
            this.mCollapseButtonView.setOnClickListener(new View.OnClickListener() {
                /* class androidx.appcompat.widget.Toolbar.View$OnClickListenerC03733 */

                static {
                    Covode.recordClassIndex(436);
                }

                public final void onClick(View view) {
                    Toolbar.this.collapseActionView();
                }
            });
        }
    }

    public int getCurrentContentInsetEnd() {
        C0302h hVar;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView == null || (hVar = actionMenuView.f1283a) == null || !hVar.hasVisibleItems()) {
            return getContentInsetEnd();
        }
        return Math.max(getContentInsetEnd(), Math.max(this.mContentInsetEndWithActions, 0));
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C0375a aVar = this.mExpandedMenuPresenter;
        if (!(aVar == null || aVar.f1450b == null)) {
            savedState.f1447a = this.mExpandedMenuPresenter.f1450b.getItemId();
        }
        savedState.f1448b = isOverflowMenuShowing();
        return savedState;
    }

    /* access modifiers changed from: package-private */
    public void removeChildrenForExpandedActionView() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((C0376b) childAt.getLayoutParams()).f1452b == 2 || childAt == this.mMenuView)) {
                removeViewAt(childCount);
                this.mHiddenViews.add(childAt);
            }
        }
    }

    public void setOnMenuItemClickListener(AbstractC0377c cVar) {
        this.mOnMenuItemClickListener = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    public class C0375a implements AbstractC0318o {

        /* renamed from: a */
        C0302h f1449a;

        /* renamed from: b */
        C0306j f1450b;

        static {
            Covode.recordClassIndex(439);
        }

        @Override // androidx.appcompat.view.menu.AbstractC0318o
        /* renamed from: a */
        public final void mo909a(Parcelable parcelable) {
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
        public final int mo900b() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.AbstractC0318o
        /* renamed from: f */
        public final Parcelable mo920f() {
            return null;
        }

        C0375a() {
        }

        @Override // androidx.appcompat.view.menu.AbstractC0318o
        /* renamed from: a */
        public final void mo895a(boolean z) {
            if (this.f1450b != null) {
                C0302h hVar = this.f1449a;
                if (hVar != null) {
                    int size = hVar.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f1449a.getItem(i) == this.f1450b) {
                            return;
                        }
                    }
                }
                mo902c(this.f1450b);
            }
        }

        @Override // androidx.appcompat.view.menu.AbstractC0318o
        /* renamed from: c */
        public final boolean mo902c(C0306j jVar) {
            if (Toolbar.this.mExpandedActionView instanceof AbstractC0276c) {
                ((AbstractC0276c) Toolbar.this.mExpandedActionView).mo742b();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.mExpandedActionView);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.mCollapseButtonView);
            Toolbar.this.mExpandedActionView = null;
            Toolbar.this.addChildrenForExpandedActionView();
            this.f1450b = null;
            Toolbar.this.requestLayout();
            jVar.mo1014d(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.AbstractC0318o
        /* renamed from: b */
        public final boolean mo901b(C0306j jVar) {
            Toolbar.this.ensureCollapseButtonView();
            ViewParent parent = Toolbar.this.mCollapseButtonView.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.mCollapseButtonView);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.mCollapseButtonView);
            }
            Toolbar.this.mExpandedActionView = jVar.getActionView();
            this.f1450b = jVar;
            ViewParent parent2 = Toolbar.this.mExpandedActionView.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.mExpandedActionView);
                }
                C0376b generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                generateDefaultLayoutParams.f637a = 8388611 | (Toolbar.this.mButtonGravity & 112);
                generateDefaultLayoutParams.f1452b = 2;
                Toolbar.this.mExpandedActionView.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar4 = Toolbar.this;
                toolbar4.addView(toolbar4.mExpandedActionView);
            }
            Toolbar.this.removeChildrenForExpandedActionView();
            Toolbar.this.requestLayout();
            jVar.mo1014d(true);
            if (Toolbar.this.mExpandedActionView instanceof AbstractC0276c) {
                ((AbstractC0276c) Toolbar.this.mExpandedActionView).mo741a();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.AbstractC0318o
        /* renamed from: a */
        public final void mo891a(Context context, C0302h hVar) {
            C0306j jVar;
            C0302h hVar2 = this.f1449a;
            if (!(hVar2 == null || (jVar = this.f1450b) == null)) {
                hVar2.mo974b(jVar);
            }
            this.f1449a = hVar;
        }
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public void setCollapsible(boolean z) {
        this.mCollapsible = z;
        requestLayout();
    }

    public void setTitleMarginBottom(int i) {
        this.mTitleMarginBottom = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.mTitleMarginEnd = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.mTitleMarginStart = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.mTitleMarginTop = i;
        requestLayout();
    }

    private int getHorizontalMargins(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C0778h.m2702a(marginLayoutParams) + C0778h.m2704b(marginLayoutParams);
    }

    private int getVerticalMargins(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private static boolean isCustomView(View view) {
        if (((C0376b) view.getLayoutParams()).f1452b == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!super.checkLayoutParams(layoutParams) || !(layoutParams instanceof C0376b)) {
            return false;
        }
        return true;
    }

    public void inflateMenu(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public void setLogo(int i) {
        setLogo(C0196a.m619b(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getContext().getText(i);
        } else {
            charSequence = null;
        }
        setNavigationContentDescription(charSequence);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C0196a.m619b(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        ensureNavButtonView();
        this.mNavButtonView.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        ensureMenu();
        this.mMenuView.setOverflowIcon(drawable);
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        this.mSubtitleTextColor = i;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleTextColor(int i) {
        this.mTitleTextColor = i;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    private int getChildHorizontalGravity(int i) {
        int e = C0792v.m2768e(this);
        int a = C0774e.m2693a(i, e) & 7;
        if (a == 1 || a == 3 || a == 5) {
            return a;
        }
        if (e == 1) {
            return 5;
        }
        return 3;
    }

    private int getChildVerticalGravity(int i) {
        int i2 = i & 112;
        if (i2 == 16 || i2 == 48 || i2 == 80) {
            return i2;
        }
        return this.mGravity & 112;
    }

    private boolean isChildOrHidden(View view) {
        if (view.getParent() == this || this.mHiddenViews.contains(view)) {
            return true;
        }
        return false;
    }

    private boolean shouldLayout(View view) {
        if (view == null || view.getParent() != this || view.getVisibility() == 8) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public C0376b generateLayoutParams(AttributeSet attributeSet) {
        return new C0376b(getContext(), attributeSet);
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.mContentInsetEndWithActions) {
            this.mContentInsetEndWithActions = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.mContentInsetStartWithNavigation) {
            this.mContentInsetStartWithNavigation = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureLogoView();
        }
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureNavButtonView();
        }
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setPopupTheme(int i) {
        if (this.mPopupTheme != i) {
            this.mPopupTheme = i;
            if (i == 0) {
                this.mPopupContext = getContext();
            } else {
                this.mPopupContext = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public C0376b generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0376b) {
            return new C0376b((C0376b) layoutParams);
        }
        if (layoutParams instanceof AbstractC0211a.C0212a) {
            return new C0376b((AbstractC0211a.C0212a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0376b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0376b(layoutParams);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.mEatingHover = false;
        }
        if (!this.mEatingHover) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9) {
                if (!onHoverEvent) {
                    this.mEatingHover = true;
                }
                return true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.mEatingHover = false;
        }
        return true;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C0302h hVar;
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f3089d);
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            hVar = actionMenuView.f1283a;
        } else {
            hVar = null;
        }
        if (!(savedState.f1447a == 0 || this.mExpandedMenuPresenter == null || hVar == null || (findItem = hVar.findItem(savedState.f1447a)) == null)) {
            findItem.expandActionView();
        }
        if (savedState.f1448b) {
            postShowOverflowMenu();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mEatingTouch = false;
        }
        if (!this.mEatingTouch) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!onTouchEvent) {
                    this.mEatingTouch = true;
                }
                return true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.mEatingTouch = false;
        }
        return true;
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            ensureLogoView();
            if (!isChildOrHidden(this.mLogoView)) {
                addSystemView(this.mLogoView, true);
            }
        } else {
            ImageView imageView = this.mLogoView;
            if (imageView != null && isChildOrHidden(imageView)) {
                removeView(this.mLogoView);
                this.mHiddenViews.remove(this.mLogoView);
            }
        }
        ImageView imageView2 = this.mLogoView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            ensureNavButtonView();
            if (!isChildOrHidden(this.mNavButtonView)) {
                addSystemView(this.mNavButtonView, true);
            }
        } else {
            ImageButton imageButton = this.mNavButtonView;
            if (imageButton != null && isChildOrHidden(imageButton)) {
                removeView(this.mNavButtonView);
                this.mHiddenViews.remove(this.mNavButtonView);
            }
        }
        ImageButton imageButton2 = this.mNavButtonView;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void onRtlPropertiesChanged(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = Build.VERSION.SDK_INT;
        super.onRtlPropertiesChanged(i);
        ensureContentInsets();
        C0394ae aeVar = this.mContentInsets;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z != aeVar.f1526g) {
            aeVar.f1526g = z;
            if (!aeVar.f1527h) {
                aeVar.f1520a = aeVar.f1524e;
                aeVar.f1521b = aeVar.f1525f;
            } else if (z) {
                if (aeVar.f1523d != Integer.MIN_VALUE) {
                    i4 = aeVar.f1523d;
                } else {
                    i4 = aeVar.f1524e;
                }
                aeVar.f1520a = i4;
                if (aeVar.f1522c != Integer.MIN_VALUE) {
                    i5 = aeVar.f1522c;
                } else {
                    i5 = aeVar.f1525f;
                }
                aeVar.f1521b = i5;
            } else {
                if (aeVar.f1522c != Integer.MIN_VALUE) {
                    i2 = aeVar.f1522c;
                } else {
                    i2 = aeVar.f1524e;
                }
                aeVar.f1520a = i2;
                if (aeVar.f1523d != Integer.MIN_VALUE) {
                    i3 = aeVar.f1523d;
                } else {
                    i3 = aeVar.f1525f;
                }
                aeVar.f1521b = i3;
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.mSubtitleTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.mSubtitleTextView = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.mSubtitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.mSubtitleTextAppearance;
                if (i != 0) {
                    this.mSubtitleTextView.setTextAppearance(context, i);
                }
                int i2 = this.mSubtitleTextColor;
                if (i2 != 0) {
                    this.mSubtitleTextView.setTextColor(i2);
                }
            }
            if (!isChildOrHidden(this.mSubtitleTextView)) {
                addSystemView(this.mSubtitleTextView, true);
            }
        } else {
            TextView textView = this.mSubtitleTextView;
            if (textView != null && isChildOrHidden(textView)) {
                removeView(this.mSubtitleTextView);
                this.mHiddenViews.remove(this.mSubtitleTextView);
            }
        }
        TextView textView2 = this.mSubtitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mSubtitleText = charSequence;
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.mTitleTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.mTitleTextView = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.mTitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.mTitleTextAppearance;
                if (i != 0) {
                    this.mTitleTextView.setTextAppearance(context, i);
                }
                int i2 = this.mTitleTextColor;
                if (i2 != 0) {
                    this.mTitleTextView.setTextColor(i2);
                }
            }
            if (!isChildOrHidden(this.mTitleTextView)) {
                addSystemView(this.mTitleTextView, true);
            }
        } else {
            TextView textView = this.mTitleTextView;
            if (textView != null && isChildOrHidden(textView)) {
                removeView(this.mTitleTextView);
                this.mHiddenViews.remove(this.mTitleTextView);
            }
        }
        TextView textView2 = this.mTitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mTitleText = charSequence;
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ajc);
    }

    public void setContentInsetsAbsolute(int i, int i2) {
        ensureContentInsets();
        this.mContentInsets.mo1787b(i, i2);
    }

    public void setContentInsetsRelative(int i, int i2) {
        ensureContentInsets();
        this.mContentInsets.mo1786a(i, i2);
    }

    public void setMenuCallbacks(AbstractC0318o.AbstractC0319a aVar, C0302h.AbstractC0303a aVar2) {
        this.mActionMenuPresenterCallback = aVar;
        this.mMenuBuilderCallback = aVar2;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            actionMenuView.mo1293a(aVar, aVar2);
        }
    }

    public void setSubtitleTextAppearance(Context context, int i) {
        this.mSubtitleTextAppearance = i;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setTitleTextAppearance(Context context, int i) {
        this.mTitleTextAppearance = i;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    private void addSystemView(View view, boolean z) {
        C0376b bVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            bVar = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            bVar = generateLayoutParams(layoutParams);
        } else {
            bVar = (C0376b) layoutParams;
        }
        bVar.f1452b = 1;
        if (!z || this.mExpandedActionView == null) {
            addView(view, bVar);
            return;
        }
        view.setLayoutParams(bVar);
        this.mHiddenViews.add(view);
    }

    private int getViewListMeasuredWidth(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            View view = list.get(i4);
            C0376b bVar = (C0376b) view.getLayoutParams();
            int i5 = bVar.leftMargin - i;
            int i6 = bVar.rightMargin - i2;
            int max = Math.max(0, i5);
            int max2 = Math.max(0, i6);
            i = Math.max(0, -i5);
            i2 = Math.max(0, -i6);
            i3 += max + view.getMeasuredWidth() + max2;
        }
        return i3;
    }

    private void addCustomViewsWithGravity(List<View> list, int i) {
        boolean z;
        if (C0792v.m2768e(this) == 1) {
            z = true;
        } else {
            z = false;
        }
        int childCount = getChildCount();
        int a = C0774e.m2693a(i, C0792v.m2768e(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                C0376b bVar = (C0376b) childAt.getLayoutParams();
                if (bVar.f1452b == 0 && shouldLayout(childAt) && getChildHorizontalGravity(bVar.f637a) == a) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            C0376b bVar2 = (C0376b) childAt2.getLayoutParams();
            if (bVar2.f1452b == 0 && shouldLayout(childAt2) && getChildHorizontalGravity(bVar2.f637a) == a) {
                list.add(childAt2);
            }
        }
    }

    private int getChildTop(View view, int i) {
        int i2;
        C0376b bVar = (C0376b) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i > 0) {
            i2 = (measuredHeight - i) / 2;
        } else {
            i2 = 0;
        }
        int childVerticalGravity = getChildVerticalGravity(bVar.f637a);
        if (childVerticalGravity == 48) {
            return getPaddingTop() - i2;
        }
        if (childVerticalGravity == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - bVar.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        if (i3 < bVar.topMargin) {
            i3 = bVar.topMargin;
        } else {
            int i4 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
            if (i4 < bVar.bottomMargin) {
                i3 = Math.max(0, i3 - (bVar.bottomMargin - i4));
            }
        }
        return paddingTop + i3;
    }

    public void setMenu(C0302h hVar, ActionMenuPresenter actionMenuPresenter) {
        if (hVar != null || this.mMenuView != null) {
            ensureMenuView();
            C0302h hVar2 = this.mMenuView.f1283a;
            if (hVar2 != hVar) {
                if (hVar2 != null) {
                    hVar2.mo971b(this.mOuterActionMenuPresenter);
                    hVar2.mo971b(this.mExpandedMenuPresenter);
                }
                if (this.mExpandedMenuPresenter == null) {
                    this.mExpandedMenuPresenter = new C0375a();
                }
                actionMenuPresenter.f1258m = true;
                if (hVar != null) {
                    hVar.mo955a(actionMenuPresenter, this.mPopupContext);
                    hVar.mo955a(this.mExpandedMenuPresenter, this.mPopupContext);
                } else {
                    actionMenuPresenter.mo891a(this.mPopupContext, (C0302h) null);
                    this.mExpandedMenuPresenter.mo891a(this.mPopupContext, (C0302h) null);
                    actionMenuPresenter.mo895a(true);
                    this.mExpandedMenuPresenter.mo895a(true);
                }
                this.mMenuView.setPopupTheme(this.mPopupTheme);
                this.mMenuView.setPresenter(actionMenuPresenter);
                this.mOuterActionMenuPresenter = actionMenuPresenter;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        char c;
        char c2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr = this.mTempMargins;
        int i9 = 0;
        if (C0415ar.m1540a(this)) {
            c = 1;
            c2 = 0;
        } else {
            c = 0;
            c2 = 1;
        }
        int i10 = i;
        int i11 = i2;
        if (shouldLayout(this.mNavButtonView)) {
            measureChildConstrained(this.mNavButtonView, i10, 0, i11, 0, this.mMaxButtonHeight);
            i3 = this.mNavButtonView.getMeasuredWidth() + getHorizontalMargins(this.mNavButtonView);
            i4 = Math.max(0, this.mNavButtonView.getMeasuredHeight() + getVerticalMargins(this.mNavButtonView));
            i5 = View.combineMeasuredStates(0, this.mNavButtonView.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (shouldLayout(this.mCollapseButtonView)) {
            measureChildConstrained(this.mCollapseButtonView, i10, 0, i11, 0, this.mMaxButtonHeight);
            i3 = this.mCollapseButtonView.getMeasuredWidth() + getHorizontalMargins(this.mCollapseButtonView);
            i4 = Math.max(i4, this.mCollapseButtonView.getMeasuredHeight() + getVerticalMargins(this.mCollapseButtonView));
            i5 = View.combineMeasuredStates(i5, this.mCollapseButtonView.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i3) + 0;
        iArr[c] = Math.max(0, currentContentInsetStart - i3);
        if (shouldLayout(this.mMenuView)) {
            measureChildConstrained(this.mMenuView, i10, max, i11, 0, this.mMaxButtonHeight);
            i6 = this.mMenuView.getMeasuredWidth() + getHorizontalMargins(this.mMenuView);
            i4 = Math.max(i4, this.mMenuView.getMeasuredHeight() + getVerticalMargins(this.mMenuView));
            i5 = View.combineMeasuredStates(i5, this.mMenuView.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c2] = Math.max(0, currentContentInsetEnd - i6);
        if (shouldLayout(this.mExpandedActionView)) {
            max2 += measureChildCollapseMargins(this.mExpandedActionView, i10, max2, i11, 0, iArr);
            i4 = Math.max(i4, this.mExpandedActionView.getMeasuredHeight() + getVerticalMargins(this.mExpandedActionView));
            i5 = View.combineMeasuredStates(i5, this.mExpandedActionView.getMeasuredState());
        }
        if (shouldLayout(this.mLogoView)) {
            max2 += measureChildCollapseMargins(this.mLogoView, i10, max2, i11, 0, iArr);
            i4 = Math.max(i4, this.mLogoView.getMeasuredHeight() + getVerticalMargins(this.mLogoView));
            i5 = View.combineMeasuredStates(i5, this.mLogoView.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((C0376b) childAt.getLayoutParams()).f1452b == 0 && shouldLayout(childAt)) {
                i10 = i10;
                i11 = i11;
                max2 += measureChildCollapseMargins(childAt, i10, max2, i11, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + getVerticalMargins(childAt));
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        int i13 = this.mTitleMarginTop + this.mTitleMarginBottom;
        int i14 = this.mTitleMarginStart + this.mTitleMarginEnd;
        if (shouldLayout(this.mTitleTextView)) {
            measureChildCollapseMargins(this.mTitleTextView, i10, max2 + i14, i11, i13, iArr);
            i7 = this.mTitleTextView.getMeasuredWidth() + getHorizontalMargins(this.mTitleTextView);
            i8 = this.mTitleTextView.getMeasuredHeight() + getVerticalMargins(this.mTitleTextView);
            i5 = View.combineMeasuredStates(i5, this.mTitleTextView.getMeasuredState());
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (shouldLayout(this.mSubtitleTextView)) {
            i7 = Math.max(i7, measureChildCollapseMargins(this.mSubtitleTextView, i10, max2 + i14, i11, i8 + i13, iArr));
            i8 += this.mSubtitleTextView.getMeasuredHeight() + getVerticalMargins(this.mSubtitleTextView);
            i5 = View.combineMeasuredStates(i5, this.mSubtitleTextView.getMeasuredState());
        }
        int max3 = Math.max(i4, i8);
        int paddingLeft = max2 + i7 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i10, -16777216 & i5);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i11, i5 << 16);
        if (!shouldCollapse()) {
            i9 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i9);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mGravity = 8388627;
        this.mTempViews = new ArrayList<>();
        this.mHiddenViews = new ArrayList<>();
        this.mTempMargins = new int[2];
        this.mMenuViewItemClickListener = new ActionMenuView.AbstractC0348e() {
            /* class androidx.appcompat.widget.Toolbar.C03711 */

            static {
                Covode.recordClassIndex(434);
            }

            @Override // androidx.appcompat.widget.ActionMenuView.AbstractC0348e
            /* renamed from: a */
            public final boolean mo1316a(MenuItem menuItem) {
                if (Toolbar.this.mOnMenuItemClickListener != null) {
                    return Toolbar.this.mOnMenuItemClickListener.onMenuItemClick(menuItem);
                }
                return false;
            }
        };
        this.mShowOverflowMenuRunnable = new Runnable() {
            /* class androidx.appcompat.widget.Toolbar.RunnableC03722 */

            static {
                Covode.recordClassIndex(435);
            }

            public final void run() {
                Toolbar.this.showOverflowMenu();
            }
        };
        C0405al a = C0405al.m1466a(getContext(), attributeSet, new int[]{16842927, 16843072, R.attr.lt, R.attr.o5, R.attr.o6, R.attr.pj, R.attr.pk, R.attr.pl, R.attr.pm, R.attr.pn, R.attr.po, R.attr.a3p, R.attr.a3q, R.attr.a51, R.attr.a65, R.attr.a66, R.attr.a7j, R.attr.afv, R.attr.afw, R.attr.afx, R.attr.aiw, R.attr.aiz, R.attr.aj0, R.attr.aj1, R.attr.aj2, R.attr.aj3, R.attr.aj4, R.attr.aj6, R.attr.aj7}, i, 0);
        this.mTitleTextAppearance = a.mo1838g(27, 0);
        this.mSubtitleTextAppearance = a.mo1838g(18, 0);
        this.mGravity = a.mo1830c(0, this.mGravity);
        this.mButtonGravity = a.mo1830c(2, 48);
        int d = a.mo1832d(21, 0);
        d = a.mo1837f(26) ? a.mo1832d(26, d) : d;
        this.mTitleMarginBottom = d;
        this.mTitleMarginTop = d;
        this.mTitleMarginEnd = d;
        this.mTitleMarginStart = d;
        int d2 = a.mo1832d(24, -1);
        if (d2 >= 0) {
            this.mTitleMarginStart = d2;
        }
        int d3 = a.mo1832d(23, -1);
        if (d3 >= 0) {
            this.mTitleMarginEnd = d3;
        }
        int d4 = a.mo1832d(25, -1);
        if (d4 >= 0) {
            this.mTitleMarginTop = d4;
        }
        int d5 = a.mo1832d(22, -1);
        if (d5 >= 0) {
            this.mTitleMarginBottom = d5;
        }
        this.mMaxButtonHeight = a.mo1834e(13, -1);
        int d6 = a.mo1832d(9, Integer.MIN_VALUE);
        int d7 = a.mo1832d(5, Integer.MIN_VALUE);
        int e = a.mo1834e(7, 0);
        int e2 = a.mo1834e(8, 0);
        ensureContentInsets();
        this.mContentInsets.mo1787b(e, e2);
        if (!(d6 == Integer.MIN_VALUE && d7 == Integer.MIN_VALUE)) {
            this.mContentInsets.mo1786a(d6, d7);
        }
        this.mContentInsetStartWithNavigation = a.mo1832d(10, Integer.MIN_VALUE);
        this.mContentInsetEndWithActions = a.mo1832d(6, Integer.MIN_VALUE);
        this.mCollapseIcon = a.mo1826a(4);
        this.mCollapseDescription = a.mo1831c(3);
        CharSequence c = a.mo1831c(20);
        if (!TextUtils.isEmpty(c)) {
            setTitle(c);
        }
        CharSequence c2 = a.mo1831c(17);
        if (!TextUtils.isEmpty(c2)) {
            setSubtitle(c2);
        }
        this.mPopupContext = getContext();
        setPopupTheme(a.mo1838g(16, 0));
        Drawable a2 = a.mo1826a(15);
        if (a2 != null) {
            setNavigationIcon(a2);
        }
        CharSequence c3 = a.mo1831c(14);
        if (!TextUtils.isEmpty(c3)) {
            setNavigationContentDescription(c3);
        }
        Drawable a3 = a.mo1826a(11);
        if (a3 != null) {
            setLogo(a3);
        }
        CharSequence c4 = a.mo1831c(12);
        if (!TextUtils.isEmpty(c4)) {
            setLogoDescription(c4);
        }
        if (a.mo1837f(28)) {
            setTitleTextColor(a.mo1828b(28, -1));
        }
        if (a.mo1837f(19)) {
            setSubtitleTextColor(a.mo1828b(19, -1));
        }
        a.f1585a.recycle();
    }

    public void setTitleMargin(int i, int i2, int i3, int i4) {
        this.mTitleMarginStart = i;
        this.mTitleMarginTop = i2;
        this.mTitleMarginEnd = i3;
        this.mTitleMarginBottom = i4;
        requestLayout();
    }

    private int layoutChildLeft(View view, int i, int[] iArr, int i2) {
        C0376b bVar = (C0376b) view.getLayoutParams();
        int i3 = bVar.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int childTop = getChildTop(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, childTop, max + measuredWidth, view.getMeasuredHeight() + childTop);
        return max + measuredWidth + bVar.rightMargin;
    }

    private int layoutChildRight(View view, int i, int[] iArr, int i2) {
        C0376b bVar = (C0376b) view.getLayoutParams();
        int i3 = bVar.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int childTop = getChildTop(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, childTop, max, view.getMeasuredHeight() + childTop);
        return max - (measuredWidth + bVar.leftMargin);
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x02b1 A[LOOP:1: B:100:0x02af->B:101:0x02b1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02e1 A[LOOP:2: B:105:0x02df->B:106:0x02e1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02f0  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01ae A[LOOP:0: B:64:0x01ac->B:65:0x01ae, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r22, int r23, int r24, int r25, int r26) {
        /*
        // Method dump skipped, instructions count: 766
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    private int measureChildCollapseMargins(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void measureChildConstrained(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }
}
