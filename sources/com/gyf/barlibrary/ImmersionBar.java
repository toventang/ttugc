package com.gyf.barlibrary;

import android.app.Activity;
import android.app.Dialog;
import android.database.ContentObserver;
import android.graphics.Color;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.core.content.C0643b;
import androidx.core.graphics.C0699a;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ImmersionBar {
    private static final int IMMERSION_NAVIGATION_BAR_VIEW = R.id.bmg;
    private static final int IMMERSION_STATUS_BAR_VIEW = R.id.bmh;
    private static Map<String, ImmersionBar> mImmersionBarMap = new HashMap();
    public Activity mActivity;
    public BarConfig mBarConfig;
    public BarParams mBarParams;
    public ViewGroup mContentView;
    public ViewGroup mDecorView;
    private Dialog mDialog;
    private FitsKeyboard mFitsKeyboard;
    private int mFitsStatusBarType;
    private Fragment mFragment;
    private boolean mHasNavigationBarColor;
    private String mImmersionBarName;
    private boolean mIsFitsLayoutOverlap;
    private boolean mIsFitsNotch;
    private boolean mIsFragment;
    public int mNavigationBarHeight;
    public int mNavigationBarWidth;
    private ContentObserver mNavigationObserver;
    private int mPaddingBottom;
    private int mPaddingLeft;
    private int mPaddingRight;
    private int mPaddingTop;
    private Map<String, BarParams> mTagMap;
    private Window mWindow;

    public BarParams getBarParams() {
        return this.mBarParams;
    }

    /* access modifiers changed from: package-private */
    public int getPaddingBottom() {
        return this.mPaddingBottom;
    }

    /* access modifiers changed from: package-private */
    public int getPaddingLeft() {
        return this.mPaddingLeft;
    }

    /* access modifiers changed from: package-private */
    public int getPaddingRight() {
        return this.mPaddingRight;
    }

    /* access modifiers changed from: package-private */
    public int getPaddingTop() {
        return this.mPaddingTop;
    }

    public ImmersionBar transparentStatusBar() {
        this.mBarParams.statusBarColor = 0;
        return this;
    }

    public static boolean isSupportNavigationIconDark() {
        if (OSUtils.isMIUI6Later() || Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    public void init() {
        updateBarParams();
        setBar();
        fitsLayoutOverlap();
        fitsKeyboard();
        transformView();
    }

    public ImmersionBar reset() {
        this.mBarParams = new BarParams();
        this.mFitsStatusBarType = 0;
        return this;
    }

    public ImmersionBar transparentNavigationBar() {
        this.mBarParams.navigationBarColor = 0;
        this.mBarParams.useDefaultNavigationBarColor = false;
        this.mBarParams.fullScreen = true;
        return this;
    }

    static {
        Covode.recordClassIndex(33736);
    }

    private void cancelListener() {
        Activity activity = this.mActivity;
        if (activity != null) {
            if (this.mNavigationObserver != null) {
                activity.getContentResolver().unregisterContentObserver(this.mNavigationObserver);
                this.mNavigationObserver = null;
            }
            FitsKeyboard fitsKeyboard = this.mFitsKeyboard;
            if (fitsKeyboard != null) {
                fitsKeyboard.cancel();
                this.mFitsKeyboard = null;
            }
        }
    }

    private void checkNavigationBarInitialized() {
        if (Build.VERSION.SDK_INT >= 21 && this.mBarParams.useDefaultNavigationBarColor) {
            this.mBarParams.navigationBarColor = this.mWindow.getNavigationBarColor();
        }
    }

    private void fitsNotchScreen() {
        if (Build.VERSION.SDK_INT >= 28 && !this.mIsFitsNotch) {
            WindowManager.LayoutParams attributes = this.mWindow.getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            this.mWindow.setAttributes(attributes);
            this.mIsFitsNotch = true;
        }
    }

    private void initParams() {
        this.mBarParams = new BarParams();
        ViewGroup viewGroup = (ViewGroup) this.mWindow.getDecorView();
        this.mDecorView = viewGroup;
        this.mContentView = (ViewGroup) viewGroup.findViewById(16908290);
    }

    public static boolean isSupportStatusBarDarkFont() {
        if (OSUtils.isMIUI6Later() || OSUtils.isFlymeOS4Later() || Build.VERSION.SDK_INT >= 23) {
            return true;
        }
        return false;
    }

    public ImmersionBar removeSupportAllView() {
        if (this.mBarParams.viewMap.size() != 0) {
            this.mBarParams.viewMap.clear();
        }
        return this;
    }

    public ImmersionBar transparentBar() {
        this.mBarParams.statusBarColor = 0;
        this.mBarParams.navigationBarColor = 0;
        this.mBarParams.useDefaultNavigationBarColor = false;
        this.mBarParams.fullScreen = true;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.gyf.barlibrary.ImmersionBar$3 */
    public static /* synthetic */ class C280533 {
        static final /* synthetic */ int[] $SwitchMap$com$gyf$barlibrary$BarHide;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        static {
            /*
                r0 = 33739(0x83cb, float:4.7278E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.gyf.barlibrary.BarHide[] r0 = com.gyf.barlibrary.BarHide.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.gyf.barlibrary.ImmersionBar.C280533.$SwitchMap$com$gyf$barlibrary$BarHide = r2
                com.gyf.barlibrary.BarHide r0 = com.gyf.barlibrary.BarHide.FLAG_HIDE_BAR     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.gyf.barlibrary.ImmersionBar.C280533.$SwitchMap$com$gyf$barlibrary$BarHide     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.gyf.barlibrary.BarHide r0 = com.gyf.barlibrary.BarHide.FLAG_HIDE_STATUS_BAR     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.gyf.barlibrary.ImmersionBar.C280533.$SwitchMap$com$gyf$barlibrary$BarHide     // Catch:{ NoSuchFieldError -> 0x002e }
                com.gyf.barlibrary.BarHide r0 = com.gyf.barlibrary.BarHide.FLAG_HIDE_NAVIGATION_BAR     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.gyf.barlibrary.ImmersionBar.C280533.$SwitchMap$com$gyf$barlibrary$BarHide     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.gyf.barlibrary.BarHide r0 = com.gyf.barlibrary.BarHide.FLAG_SHOW_BAR     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.gyf.barlibrary.ImmersionBar.C280533.<clinit>():void");
        }
    }

    private void adjustDarkModeParams() {
        boolean z;
        boolean z2 = true;
        if (this.mBarParams.autoStatusBarDarkModeEnable) {
            if (this.mBarParams.statusBarColor == 0 || this.mBarParams.statusBarColor <= -4539718) {
                z = false;
            } else {
                z = true;
            }
            statusBarDarkFont(z, this.mBarParams.autoStatusBarDarkModeAlpha);
        }
        if (this.mBarParams.autoNavigationBarDarkModeEnable) {
            if (this.mBarParams.navigationBarColor == 0 || this.mBarParams.navigationBarColor <= -4539718) {
                z2 = false;
            }
            navigationBarDarkIcon(z2, this.mBarParams.autoNavigationBarDarkModeAlpha);
        }
    }

    private void checkNavigationBarFlag() {
        boolean z;
        if (Build.VERSION.SDK_INT >= 26 && this.mBarParams.useDefaultNavigationBarColor) {
            BarParams barParams = this.mBarParams;
            if ((this.mWindow.getDecorView().getSystemUiVisibility() & 16) != 0) {
                z = true;
            } else {
                z = false;
            }
            barParams.navigationBarDarkIcon = z;
        }
    }

    private void fitsLayoutOverlap() {
        int i = Build.VERSION.SDK_INT;
        if (!this.mIsFitsLayoutOverlap) {
            int i2 = this.mFitsStatusBarType;
            if (i2 == 1) {
                setTitleBar(this.mActivity, this.mBarParams.titleBarView);
                this.mIsFitsLayoutOverlap = true;
            } else if (i2 == 2) {
                setTitleBarMarginTop(this.mActivity, this.mBarParams.titleBarView);
                this.mIsFitsLayoutOverlap = true;
            } else if (i2 == 3) {
                setStatusBarView(this.mActivity, this.mBarParams.statusBarView);
                this.mIsFitsLayoutOverlap = true;
            }
        }
    }

    private void fitsWindows() {
        if (Build.VERSION.SDK_INT < 21 || OSUtils.isEMUI3_x()) {
            fitsWindowsBelowLOLLIPOP();
            if (!this.mIsFragment && OSUtils.isEMUI3_x()) {
                fitsWindowsEMUI();
                return;
            }
            return;
        }
        fitsWindowsAboveLOLLIPOP();
    }

    private void updateBarParams() {
        ImmersionBar immersionBar;
        adjustDarkModeParams();
        int i = Build.VERSION.SDK_INT;
        if (OSUtils.isEMUI3_x() && this.mBarParams.navigationBarWithKitkatEnable) {
            BarParams barParams = this.mBarParams;
            barParams.navigationBarWithKitkatEnable = barParams.navigationBarWithEMUI3Enable;
        }
        this.mBarConfig = new BarConfig(this.mActivity);
        if (this.mIsFragment && (immersionBar = mImmersionBarMap.get(this.mActivity.toString())) != null) {
            immersionBar.mBarParams = this.mBarParams;
        }
    }

    public void destroy() {
        cancelListener();
        Iterator<Map.Entry<String, ImmersionBar>> it = mImmersionBarMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, ImmersionBar> next = it.next();
            if (next.getKey().contains(this.mImmersionBarName) || next.getKey().equals(this.mImmersionBarName)) {
                it.remove();
            }
        }
    }

    private void fitsKeyboard() {
        int i = Build.VERSION.SDK_INT;
        if (this.mIsFragment) {
            ImmersionBar immersionBar = mImmersionBarMap.get(this.mActivity.toString());
            if (immersionBar == null) {
                return;
            }
            if (immersionBar.mBarParams.keyboardEnable) {
                if (immersionBar.mFitsKeyboard == null) {
                    immersionBar.mFitsKeyboard = new FitsKeyboard(immersionBar, immersionBar.mActivity, immersionBar.mWindow);
                }
                immersionBar.mFitsKeyboard.enable(immersionBar.mBarParams.keyboardMode);
                return;
            }
            FitsKeyboard fitsKeyboard = immersionBar.mFitsKeyboard;
            if (fitsKeyboard != null) {
                fitsKeyboard.disable();
            }
        } else if (this.mBarParams.keyboardEnable) {
            if (this.mFitsKeyboard == null) {
                this.mFitsKeyboard = new FitsKeyboard(this, this.mActivity, this.mWindow);
            }
            this.mFitsKeyboard.enable(this.mBarParams.keyboardMode);
        } else {
            FitsKeyboard fitsKeyboard2 = this.mFitsKeyboard;
            if (fitsKeyboard2 != null) {
                fitsKeyboard2.disable();
            }
        }
    }

    private void fitsWindowsAboveLOLLIPOP() {
        int i;
        if (!checkFitsSystemWindows(this.mDecorView.findViewById(16908290))) {
            if (!this.mBarParams.fits || this.mFitsStatusBarType != 4) {
                i = 0;
            } else {
                i = this.mBarConfig.getStatusBarHeight();
            }
            if (this.mBarParams.isSupportActionBar) {
                i = this.mBarConfig.getStatusBarHeight() + this.mBarConfig.getActionBarHeight();
            }
            setPadding(0, i, 0, 0);
        } else if (this.mBarParams.isSupportActionBar) {
            setPadding(0, this.mBarConfig.getActionBarHeight(), 0, 0);
        }
    }

    private void fitsWindowsEMUI() {
        final View findViewById = this.mDecorView.findViewById(IMMERSION_NAVIGATION_BAR_VIEW);
        if (!this.mBarParams.navigationBarEnable || !this.mBarParams.navigationBarWithKitkatEnable) {
            findViewById.setVisibility(8);
        } else if (findViewById != null && this.mNavigationObserver == null) {
            this.mNavigationObserver = new ContentObserver(new Handler()) {
                /* class com.gyf.barlibrary.ImmersionBar.C280511 */

                static {
                    Covode.recordClassIndex(33737);
                }

                public void onChange(boolean z) {
                    ImmersionBar.this.mBarConfig = new BarConfig(ImmersionBar.this.mActivity);
                    int paddingBottom = ImmersionBar.this.mContentView.getPaddingBottom();
                    int paddingRight = ImmersionBar.this.mContentView.getPaddingRight();
                    if (!(ImmersionBar.this.mActivity == null || ImmersionBar.this.mActivity.getContentResolver() == null)) {
                        if (Settings.System.getInt(ImmersionBar.this.mActivity.getContentResolver(), "navigationbar_is_min", 0) == 1) {
                            findViewById.setVisibility(8);
                        } else {
                            findViewById.setVisibility(0);
                            if (!ImmersionBar.checkFitsSystemWindows(ImmersionBar.this.mDecorView.findViewById(16908290))) {
                                if (ImmersionBar.this.mNavigationBarHeight == 0) {
                                    ImmersionBar immersionBar = ImmersionBar.this;
                                    immersionBar.mNavigationBarHeight = immersionBar.mBarConfig.getNavigationBarHeight();
                                }
                                if (ImmersionBar.this.mNavigationBarWidth == 0) {
                                    ImmersionBar immersionBar2 = ImmersionBar.this;
                                    immersionBar2.mNavigationBarWidth = immersionBar2.mBarConfig.getNavigationBarWidth();
                                }
                                if (!ImmersionBar.this.mBarParams.hideNavigationBar) {
                                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) findViewById.getLayoutParams();
                                    if (ImmersionBar.this.mBarConfig.isNavigationAtBottom()) {
                                        layoutParams.gravity = 80;
                                        layoutParams.height = ImmersionBar.this.mNavigationBarHeight;
                                        if (!ImmersionBar.this.mBarParams.fullScreen) {
                                            paddingBottom = ImmersionBar.this.mNavigationBarHeight;
                                        }
                                        paddingBottom = 0;
                                    } else {
                                        layoutParams.gravity = 8388613;
                                        layoutParams.width = ImmersionBar.this.mNavigationBarWidth;
                                        if (!ImmersionBar.this.mBarParams.fullScreen) {
                                            paddingRight = ImmersionBar.this.mNavigationBarWidth;
                                            paddingBottom = 0;
                                            findViewById.setLayoutParams(layoutParams);
                                        }
                                        paddingBottom = 0;
                                    }
                                    paddingRight = 0;
                                    findViewById.setLayoutParams(layoutParams);
                                }
                            }
                        }
                        paddingBottom = 0;
                        paddingRight = 0;
                    }
                    ImmersionBar immersionBar3 = ImmersionBar.this;
                    immersionBar3.setPadding(0, immersionBar3.mContentView.getPaddingTop(), paddingRight, paddingBottom);
                }
            };
            Activity activity = this.mActivity;
            if (activity != null && activity.getContentResolver() != null && this.mNavigationObserver != null) {
                this.mActivity.getContentResolver().registerContentObserver(Settings.System.getUriFor("navigationbar_is_min"), true, this.mNavigationObserver);
            }
        }
    }

    private void initBarBelowLOLLIPOP() {
        this.mWindow.addFlags(67108864);
        setupStatusBarView();
        if (this.mBarConfig.hasNavigationBar() || OSUtils.isEMUI3_x()) {
            if (!this.mBarParams.navigationBarEnable || !this.mBarParams.navigationBarWithKitkatEnable) {
                this.mWindow.clearFlags(134217728);
            } else {
                this.mWindow.addFlags(134217728);
            }
            if (this.mNavigationBarHeight == 0) {
                this.mNavigationBarHeight = this.mBarConfig.getNavigationBarHeight();
            }
            if (this.mNavigationBarWidth == 0) {
                this.mNavigationBarWidth = this.mBarConfig.getNavigationBarWidth();
            }
            setupNavBarView();
        }
    }

    private void setBar() {
        checkNavigationBarInitialized();
        int i = Build.VERSION.SDK_INT;
        int i2 = 256;
        if (Build.VERSION.SDK_INT < 21 || OSUtils.isEMUI3_x()) {
            initBarBelowLOLLIPOP();
        } else {
            fitsNotchScreen();
            int statusBarDarkFont = setStatusBarDarkFont(initBarAboveLOLLIPOP(256));
            checkNavigationBarFlag();
            i2 = setNavigationIconDark(statusBarDarkFont);
        }
        int hideBar = hideBar(i2);
        fitsWindows();
        this.mDecorView.setSystemUiVisibility(hideBar);
        if (OSUtils.isMIUI6Later()) {
            setMIUIBarDark(this.mWindow, "EXTRA_FLAG_STATUS_BAR_DARK_MODE", this.mBarParams.statusBarDarkFont);
            if (this.mBarParams.navigationBarEnable) {
                setMIUIBarDark(this.mWindow, "EXTRA_FLAG_NAVIGATION_BAR_DARK_MODE", this.mBarParams.navigationBarDarkIcon);
            }
        }
        if (!OSUtils.isFlymeOS4Later()) {
            return;
        }
        if (this.mBarParams.flymeOSStatusBarFontColor != 0) {
            FlymeOSStatusBarFontUtils.setStatusBarDarkIcon(this.mActivity, this.mBarParams.flymeOSStatusBarFontColor);
        } else {
            FlymeOSStatusBarFontUtils.setStatusBarDarkIcon(this.mActivity, this.mBarParams.statusBarDarkFont);
        }
    }

    private void setupNavBarView() {
        FrameLayout.LayoutParams layoutParams;
        MethodCollector.m26663i(10100);
        ViewGroup viewGroup = this.mDecorView;
        int i = IMMERSION_NAVIGATION_BAR_VIEW;
        View findViewById = viewGroup.findViewById(i);
        if (findViewById == null) {
            findViewById = new View(this.mActivity);
            findViewById.setId(i);
            this.mDecorView.addView(findViewById);
        }
        if (this.mBarConfig.isNavigationAtBottom()) {
            layoutParams = new FrameLayout.LayoutParams(-1, this.mBarConfig.getNavigationBarHeight());
            layoutParams.gravity = 80;
        } else {
            layoutParams = new FrameLayout.LayoutParams(this.mBarConfig.getNavigationBarWidth(), -1);
            layoutParams.gravity = 8388613;
        }
        findViewById.setLayoutParams(layoutParams);
        findViewById.setBackgroundColor(C0699a.m2465b(this.mBarParams.navigationBarColor, this.mBarParams.navigationBarColorTransform, this.mBarParams.navigationBarAlpha));
        if (!this.mBarParams.navigationBarEnable || !this.mBarParams.navigationBarWithKitkatEnable || this.mBarParams.hideNavigationBar) {
            findViewById.setVisibility(8);
            MethodCollector.m26664o(10100);
            return;
        }
        findViewById.setVisibility(0);
        MethodCollector.m26664o(10100);
    }

    private void setupStatusBarView() {
        MethodCollector.m26663i(9945);
        ViewGroup viewGroup = this.mDecorView;
        int i = IMMERSION_STATUS_BAR_VIEW;
        View findViewById = viewGroup.findViewById(i);
        if (findViewById == null) {
            findViewById = new View(this.mActivity);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.mBarConfig.getStatusBarHeight());
            layoutParams.gravity = 48;
            findViewById.setLayoutParams(layoutParams);
            findViewById.setVisibility(0);
            findViewById.setId(i);
            this.mDecorView.addView(findViewById);
        }
        if (this.mBarParams.statusBarColorEnabled) {
            findViewById.setBackgroundColor(C0699a.m2465b(this.mBarParams.statusBarColor, this.mBarParams.statusBarColorTransform, this.mBarParams.statusBarAlpha));
            MethodCollector.m26664o(9945);
            return;
        }
        findViewById.setBackgroundColor(C0699a.m2465b(this.mBarParams.statusBarColor, 0, this.mBarParams.statusBarAlpha));
        MethodCollector.m26664o(9945);
    }

    private void fitsWindowsBelowLOLLIPOP() {
        int i;
        int i2;
        int i3;
        if (!checkFitsSystemWindows(this.mDecorView.findViewById(16908290))) {
            if (!this.mBarParams.fits || this.mFitsStatusBarType != 4) {
                i = 0;
            } else {
                i = this.mBarConfig.getStatusBarHeight();
            }
            if (this.mBarParams.isSupportActionBar) {
                i = this.mBarConfig.getStatusBarHeight() + this.mBarConfig.getActionBarHeight();
            }
            if (!this.mBarConfig.hasNavigationBar() || !this.mBarParams.navigationBarEnable || !this.mBarParams.navigationBarWithKitkatEnable) {
                i2 = 0;
            } else {
                if (this.mBarParams.fullScreen) {
                    i2 = 0;
                    i3 = 0;
                } else if (this.mBarConfig.isNavigationAtBottom()) {
                    i3 = this.mBarConfig.getNavigationBarHeight();
                    i2 = 0;
                } else {
                    i2 = this.mBarConfig.getNavigationBarWidth();
                    i3 = 0;
                }
                if (this.mBarParams.hideNavigationBar) {
                    if (!this.mBarConfig.isNavigationAtBottom()) {
                        i2 = 0;
                    }
                } else if (!this.mBarConfig.isNavigationAtBottom()) {
                    i2 = this.mBarConfig.getNavigationBarWidth();
                }
                setPadding(0, i, i2, i3);
            }
            i3 = 0;
            setPadding(0, i, i2, i3);
        } else if (this.mBarParams.isSupportActionBar) {
            setPadding(0, this.mBarConfig.getActionBarHeight(), 0, 0);
        }
    }

    private void transformView() {
        if (this.mBarParams.viewMap.size() != 0) {
            for (Map.Entry<View, Map<Integer, Integer>> entry : this.mBarParams.viewMap.entrySet()) {
                View key = entry.getKey();
                Integer valueOf = Integer.valueOf(this.mBarParams.statusBarColor);
                Integer valueOf2 = Integer.valueOf(this.mBarParams.statusBarColorTransform);
                for (Map.Entry<Integer, Integer> entry2 : entry.getValue().entrySet()) {
                    valueOf = entry2.getKey();
                    valueOf2 = entry2.getValue();
                }
                if (key != null) {
                    if (Math.abs(this.mBarParams.viewAlpha - 0.0f) == 0.0f) {
                        key.setBackgroundColor(C0699a.m2465b(valueOf.intValue(), valueOf2.intValue(), this.mBarParams.statusBarAlpha));
                    } else {
                        key.setBackgroundColor(C0699a.m2465b(valueOf.intValue(), valueOf2.intValue(), this.mBarParams.viewAlpha));
                    }
                }
            }
        }
    }

    public static boolean hasNotchScreen(View view) {
        return NotchUtils.hasNotchScreen(view);
    }

    public static void hideStatusBar(Window window) {
        window.setFlags(1024, 1024);
    }

    public ImmersionBar autoDarkModeEnable(boolean z) {
        return autoDarkModeEnable(z, 0.2f);
    }

    public ImmersionBar autoNavigationBarDarkModeEnable(boolean z) {
        return autoNavigationBarDarkModeEnable(z, 0.2f);
    }

    public ImmersionBar autoStatusBarDarkModeEnable(boolean z) {
        return autoStatusBarDarkModeEnable(z, 0.2f);
    }

    public ImmersionBar fixMarginAtBottom(boolean z) {
        this.mBarParams.fixMarginAtBottom = z;
        return this;
    }

    public ImmersionBar flymeOSStatusBarFontColorInt(int i) {
        this.mBarParams.flymeOSStatusBarFontColor = i;
        return this;
    }

    public ImmersionBar fullScreen(boolean z) {
        this.mBarParams.fullScreen = z;
        return this;
    }

    public ImmersionBar keyboardMode(int i) {
        this.mBarParams.keyboardMode = i;
        return this;
    }

    public ImmersionBar navigationBarAlpha(float f) {
        this.mBarParams.navigationBarAlpha = f;
        return this;
    }

    public ImmersionBar navigationBarColorTransformInt(int i) {
        this.mBarParams.navigationBarColorTransform = i;
        return this;
    }

    public ImmersionBar navigationBarDarkIcon(boolean z) {
        return navigationBarDarkIcon(z, 0.2f);
    }

    public ImmersionBar navigationBarEnable(boolean z) {
        this.mBarParams.navigationBarEnable = z;
        return this;
    }

    public ImmersionBar navigationBarWithEMUI3Enable(boolean z) {
        this.mBarParams.navigationBarWithEMUI3Enable = z;
        return this;
    }

    public ImmersionBar navigationBarWithKitkatEnable(boolean z) {
        this.mBarParams.navigationBarWithKitkatEnable = z;
        return this;
    }

    public ImmersionBar statusBarAlpha(float f) {
        this.mBarParams.statusBarAlpha = f;
        return this;
    }

    public ImmersionBar statusBarColorInt(int i) {
        this.mBarParams.statusBarColor = i;
        return this;
    }

    public ImmersionBar statusBarColorTransformEnable(boolean z) {
        this.mBarParams.statusBarColorEnabled = z;
        return this;
    }

    public ImmersionBar statusBarColorTransformInt(int i) {
        this.mBarParams.statusBarColorTransform = i;
        return this;
    }

    public ImmersionBar statusBarDarkFont(boolean z) {
        return statusBarDarkFont(z, 0.2f);
    }

    public ImmersionBar supportActionBar(boolean z) {
        this.mBarParams.isSupportActionBar = z;
        return this;
    }

    public ImmersionBar titleBar(int i) {
        return titleBar(i, true);
    }

    public ImmersionBar viewAlpha(float f) {
        this.mBarParams.viewAlpha = f;
        return this;
    }

    private ImmersionBar(Fragment fragment) {
        this(fragment.getActivity(), fragment);
    }

    public static int getActionBarHeight(Activity activity) {
        return new BarConfig(activity).getActionBarHeight();
    }

    public static int getNavigationBarHeight(Activity activity) {
        return new BarConfig(activity).getNavigationBarHeight();
    }

    public static int getNavigationBarWidth(Activity activity) {
        return new BarConfig(activity).getNavigationBarWidth();
    }

    public static int getStatusBarHeight(Activity activity) {
        return new BarConfig(activity).getStatusBarHeight();
    }

    public static boolean hasNavigationBar(Activity activity) {
        return new BarConfig(activity).hasNavigationBar();
    }

    public static boolean hasNotchScreen(Activity activity) {
        return new BarConfig(activity).hasNotchScreen();
    }

    private static boolean isEmpty(String str) {
        if (str == null || str.trim().length() == 0) {
            return true;
        }
        return false;
    }

    public static boolean isNavigationAtBottom(Activity activity) {
        return new BarConfig(activity).isNavigationAtBottom();
    }

    private int setNavigationIconDark(int i) {
        if (Build.VERSION.SDK_INT < 26 || !this.mBarParams.navigationBarDarkIcon) {
            return i;
        }
        return i | 16;
    }

    private int setStatusBarDarkFont(int i) {
        if (Build.VERSION.SDK_INT < 23 || !this.mBarParams.statusBarDarkFont) {
            return i;
        }
        return i | 8192;
    }

    public ImmersionBar addViewSupportTransformColor(View view) {
        return addViewSupportTransformColorInt(view, this.mBarParams.statusBarColorTransform);
    }

    public ImmersionBar barAlpha(float f) {
        this.mBarParams.statusBarAlpha = f;
        this.mBarParams.navigationBarAlpha = f;
        return this;
    }

    public ImmersionBar barColor(int i) {
        return barColorInt(C0643b.m2378c(this.mActivity, i));
    }

    public ImmersionBar barColorInt(int i) {
        this.mBarParams.statusBarColor = i;
        this.mBarParams.navigationBarColor = i;
        this.mBarParams.useDefaultNavigationBarColor = false;
        return this;
    }

    public ImmersionBar barColorTransform(int i) {
        return barColorTransformInt(C0643b.m2378c(this.mActivity, i));
    }

    public ImmersionBar barColorTransformInt(int i) {
        this.mBarParams.statusBarColorTransform = i;
        this.mBarParams.navigationBarColorTransform = i;
        return this;
    }

    public ImmersionBar flymeOSStatusBarFontColor(int i) {
        this.mBarParams.flymeOSStatusBarFontColor = C0643b.m2378c(this.mActivity, i);
        return this;
    }

    public ImmersionBar keyboardEnable(boolean z) {
        return keyboardEnable(z, this.mBarParams.keyboardMode);
    }

    public ImmersionBar navigationBarColor(int i) {
        return navigationBarColorInt(C0643b.m2378c(this.mActivity, i));
    }

    public ImmersionBar navigationBarColorInt(int i) {
        this.mBarParams.navigationBarColor = i;
        this.mBarParams.useDefaultNavigationBarColor = false;
        return this;
    }

    public ImmersionBar navigationBarColorTransform(int i) {
        return navigationBarColorTransformInt(C0643b.m2378c(this.mActivity, i));
    }

    public ImmersionBar setOnKeyboardListener(OnKeyboardListener onKeyboardListener) {
        if (this.mBarParams.onKeyboardListener == null) {
            this.mBarParams.onKeyboardListener = onKeyboardListener;
        }
        return this;
    }

    public ImmersionBar statusBarColor(int i) {
        return statusBarColorInt(C0643b.m2378c(this.mActivity, i));
    }

    public ImmersionBar statusBarColorTransform(int i) {
        return statusBarColorTransformInt(C0643b.m2378c(this.mActivity, i));
    }

    public ImmersionBar statusBarView(int i) {
        return statusBarView(this.mActivity.findViewById(i));
    }

    private ImmersionBar(DialogInterface$OnCancelListenerC0944d dVar) {
        this(dVar, dVar.getDialog());
    }

    public static ImmersionBar with(Activity activity) {
        ImmersionBar immersionBar = mImmersionBarMap.get(activity.toString());
        if (immersionBar != null) {
            return immersionBar;
        }
        ImmersionBar immersionBar2 = new ImmersionBar(activity);
        mImmersionBarMap.put(activity.toString(), immersionBar2);
        return immersionBar2;
    }

    public ImmersionBar addTag(String str) {
        if (!isEmpty(str)) {
            this.mTagMap.put(str, this.mBarParams.clone());
            return this;
        }
        throw new IllegalArgumentException("tag cannot be null");
    }

    public ImmersionBar barColorTransform(String str) {
        return barColorTransformInt(Color.parseColor(str));
    }

    public ImmersionBar fitsSystemWindows(boolean z) {
        this.mBarParams.fits = z;
        if (!this.mBarParams.fits) {
            this.mFitsStatusBarType = 0;
        } else if (this.mFitsStatusBarType == 0) {
            this.mFitsStatusBarType = 4;
        }
        return this;
    }

    public ImmersionBar flymeOSStatusBarFontColor(String str) {
        this.mBarParams.flymeOSStatusBarFontColor = Color.parseColor(str);
        return this;
    }

    public ImmersionBar getTag(String str) {
        if (!isEmpty(str)) {
            BarParams barParams = this.mTagMap.get(str);
            if (barParams != null) {
                this.mBarParams = barParams.clone();
            }
            return this;
        }
        throw new IllegalArgumentException("tag cannot be null");
    }

    public ImmersionBar navigationBarColorTransform(String str) {
        return navigationBarColorTransformInt(Color.parseColor(str));
    }

    public ImmersionBar statusBarColorTransform(String str) {
        return statusBarColorTransformInt(Color.parseColor(str));
    }

    public ImmersionBar titleBarMarginTop(View view) {
        if (view == null) {
            return this;
        }
        if (this.mFitsStatusBarType == 0) {
            this.mFitsStatusBarType = 2;
        }
        this.mBarParams.titleBarView = view;
        return this;
    }

    public static boolean checkFitsSystemWindows(View view) {
        if (view.getFitsSystemWindows()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (((childAt instanceof DrawerLayout) && checkFitsSystemWindows(childAt)) || childAt.getFitsSystemWindows()) {
                    return true;
                }
            }
        }
        return false;
    }

    private int hideBar(int i) {
        int i2 = Build.VERSION.SDK_INT;
        int i3 = C280533.$SwitchMap$com$gyf$barlibrary$BarHide[this.mBarParams.barHide.ordinal()];
        if (i3 == 1) {
            i |= 518;
        } else if (i3 == 2) {
            i |= 1028;
        } else if (i3 == 3) {
            i |= 514;
        } else if (i3 == 4) {
            i |= 0;
        }
        return i | 4096;
    }

    public static void setFitsSystemWindows(Activity activity) {
        if (activity != null) {
            ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof ViewGroup) && !(childAt instanceof DrawerLayout)) {
                    childAt.setFitsSystemWindows(true);
                    ((ViewGroup) childAt).setClipToPadding(true);
                }
            }
        }
    }

    public ImmersionBar removeSupportView(View view) {
        if (view != null) {
            Map<Integer, Integer> map = this.mBarParams.viewMap.get(view);
            if (!(map == null || map.size() == 0)) {
                this.mBarParams.viewMap.remove(view);
            }
            return this;
        }
        throw new IllegalArgumentException("view cannot be null");
    }

    public ImmersionBar statusBarView(View view) {
        if (view == null) {
            return this;
        }
        this.mBarParams.statusBarView = view;
        if (this.mFitsStatusBarType == 0) {
            this.mFitsStatusBarType = 3;
        }
        return this;
    }

    public ImmersionBar titleBarMarginTop(int i) {
        Fragment fragment = this.mFragment;
        if (fragment == null || fragment.getView() == null) {
            return titleBarMarginTop(this.mActivity.findViewById(i));
        }
        return titleBarMarginTop(this.mFragment.getView().findViewById(i));
    }

    private ImmersionBar(Activity activity) {
        this.mTagMap = new HashMap();
        this.mIsFitsLayoutOverlap = false;
        this.mFitsStatusBarType = 0;
        this.mHasNavigationBarColor = false;
        this.mIsFitsNotch = false;
        this.mPaddingLeft = 0;
        this.mPaddingTop = 0;
        this.mPaddingRight = 0;
        this.mPaddingBottom = 0;
        this.mActivity = activity;
        this.mWindow = activity.getWindow();
        this.mImmersionBarName = this.mActivity.toString();
        this.mBarParams = new BarParams();
        ViewGroup viewGroup = (ViewGroup) this.mWindow.getDecorView();
        this.mDecorView = viewGroup;
        this.mContentView = (ViewGroup) viewGroup.findViewById(16908290);
    }

    public ImmersionBar barColor(String str) {
        return barColorInt(Color.parseColor(str));
    }

    public ImmersionBar hideBar(BarHide barHide) {
        this.mBarParams.barHide = barHide;
        if (Build.VERSION.SDK_INT == 19 || OSUtils.isEMUI3_x()) {
            this.mBarParams.useDefaultNavigationBarColor = false;
            if (this.mBarParams.barHide == BarHide.FLAG_HIDE_NAVIGATION_BAR || this.mBarParams.barHide == BarHide.FLAG_HIDE_BAR) {
                this.mBarParams.hideNavigationBar = true;
            } else {
                this.mBarParams.hideNavigationBar = false;
            }
        }
        return this;
    }

    public ImmersionBar navigationBarColor(String str) {
        return navigationBarColorInt(Color.parseColor(str));
    }

    public ImmersionBar statusBarColor(String str) {
        return statusBarColorInt(Color.parseColor(str));
    }

    public ImmersionBar titleBar(View view) {
        if (view == null) {
            return this;
        }
        return titleBar(view, true);
    }

    private int initBarAboveLOLLIPOP(int i) {
        if (!this.mHasNavigationBarColor) {
            this.mBarParams.defaultNavigationBarColor = this.mWindow.getNavigationBarColor();
            this.mHasNavigationBarColor = true;
        }
        int i2 = i | 1024;
        if (this.mBarParams.fullScreen && this.mBarParams.navigationBarEnable) {
            i2 |= 512;
        }
        this.mWindow.clearFlags(67108864);
        if (this.mBarConfig.hasNavigationBar()) {
            this.mWindow.clearFlags(134217728);
        }
        this.mWindow.addFlags(Integer.MIN_VALUE);
        if (this.mBarParams.statusBarColorEnabled) {
            this.mWindow.setStatusBarColor(C0699a.m2465b(this.mBarParams.statusBarColor, this.mBarParams.statusBarColorTransform, this.mBarParams.statusBarAlpha));
        } else {
            this.mWindow.setStatusBarColor(C0699a.m2465b(this.mBarParams.statusBarColor, 0, this.mBarParams.statusBarAlpha));
        }
        if (this.mBarParams.navigationBarEnable) {
            this.mWindow.setNavigationBarColor(C0699a.m2465b(this.mBarParams.navigationBarColor, this.mBarParams.navigationBarColorTransform, this.mBarParams.navigationBarAlpha));
        } else {
            this.mWindow.setNavigationBarColor(this.mBarParams.defaultNavigationBarColor);
        }
        return i2;
    }

    public static ImmersionBar with(Fragment fragment) {
        if (fragment.getActivity() != null) {
            ImmersionBar immersionBar = mImmersionBarMap.get(fragment.getActivity().toString() + fragment.toString());
            if (immersionBar != null) {
                return immersionBar;
            }
            ImmersionBar immersionBar2 = new ImmersionBar(fragment);
            mImmersionBarMap.put(fragment.getActivity().toString() + fragment.toString(), immersionBar2);
            return immersionBar2;
        }
        throw new IllegalArgumentException("Activity cannot be null!!!");
    }

    public static ImmersionBar with(DialogInterface$OnCancelListenerC0944d dVar) {
        if (dVar.getActivity() != null) {
            ImmersionBar immersionBar = mImmersionBarMap.get(dVar.getActivity().toString() + dVar.toString());
            if (immersionBar != null) {
                return immersionBar;
            }
            ImmersionBar immersionBar2 = new ImmersionBar(dVar);
            mImmersionBarMap.put(dVar.getActivity().toString() + dVar.toString(), immersionBar2);
            return immersionBar2;
        }
        throw new IllegalArgumentException("Activity cannot be null!!!");
    }

    private ImmersionBar(Activity activity, Dialog dialog) {
        this(activity, dialog, "");
    }

    public ImmersionBar fitsSystemWindowsInt(boolean z, int i) {
        return fitsSystemWindowsInt(z, i, -16777216, 0.0f);
    }

    public ImmersionBar autoNavigationBarDarkModeEnable(boolean z, float f) {
        this.mBarParams.autoNavigationBarDarkModeEnable = z;
        this.mBarParams.autoNavigationBarDarkModeAlpha = f;
        return this;
    }

    public ImmersionBar autoStatusBarDarkModeEnable(boolean z, float f) {
        this.mBarParams.autoStatusBarDarkModeEnable = z;
        this.mBarParams.autoStatusBarDarkModeAlpha = f;
        return this;
    }

    public ImmersionBar fitsSystemWindows(boolean z, int i) {
        return fitsSystemWindowsInt(z, C0643b.m2378c(this.mActivity, i));
    }

    public ImmersionBar statusBarColorInt(int i, float f) {
        this.mBarParams.statusBarColor = i;
        this.mBarParams.statusBarAlpha = f;
        return this;
    }

    public ImmersionBar titleBar(int i, View view) {
        return titleBar(view.findViewById(i), true);
    }

    public ImmersionBar titleBarMarginTop(int i, View view) {
        return titleBarMarginTop(view.findViewById(i));
    }

    public static void setStatusBarView(Activity activity, View view) {
        if (activity != null && view != null) {
            int i = Build.VERSION.SDK_INT;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = getStatusBarHeight(activity);
            view.setLayoutParams(layoutParams);
        }
    }

    public ImmersionBar addViewSupportTransformColor(View view, int i) {
        return addViewSupportTransformColorInt(view, C0643b.m2378c(this.mActivity, i));
    }

    public ImmersionBar autoDarkModeEnable(boolean z, float f) {
        this.mBarParams.autoStatusBarDarkModeEnable = z;
        this.mBarParams.autoStatusBarDarkModeAlpha = f;
        this.mBarParams.autoNavigationBarDarkModeEnable = z;
        this.mBarParams.autoNavigationBarDarkModeAlpha = f;
        return this;
    }

    public ImmersionBar barColor(int i, float f) {
        return barColorInt(C0643b.m2378c(this.mActivity, i), (float) i);
    }

    public ImmersionBar barColorInt(int i, float f) {
        this.mBarParams.statusBarColor = i;
        this.mBarParams.navigationBarColor = i;
        this.mBarParams.useDefaultNavigationBarColor = false;
        this.mBarParams.statusBarAlpha = f;
        this.mBarParams.navigationBarAlpha = f;
        return this;
    }

    public ImmersionBar keyboardEnable(boolean z, int i) {
        this.mBarParams.keyboardEnable = z;
        this.mBarParams.keyboardMode = i;
        return this;
    }

    public ImmersionBar navigationBarColor(int i, float f) {
        return navigationBarColorInt(C0643b.m2378c(this.mActivity, i), f);
    }

    public ImmersionBar navigationBarColorInt(int i, float f) {
        this.mBarParams.navigationBarColor = i;
        this.mBarParams.useDefaultNavigationBarColor = false;
        this.mBarParams.navigationBarAlpha = f;
        return this;
    }

    public ImmersionBar navigationBarDarkIcon(boolean z, float f) {
        this.mBarParams.navigationBarDarkIcon = z;
        if (!z || isSupportNavigationIconDark()) {
            this.mBarParams.navigationBarAlpha = 0.0f;
        } else {
            this.mBarParams.navigationBarAlpha = f;
        }
        return this;
    }

    public ImmersionBar statusBarColor(int i, float f) {
        return statusBarColorInt(C0643b.m2378c(this.mActivity, i), f);
    }

    public ImmersionBar statusBarDarkFont(boolean z, float f) {
        this.mBarParams.statusBarDarkFont = z;
        if (!z || isSupportStatusBarDarkFont()) {
            this.mBarParams.flymeOSStatusBarFontColor = 0;
            this.mBarParams.statusBarAlpha = 0.0f;
        } else {
            this.mBarParams.statusBarAlpha = f;
        }
        return this;
    }

    public ImmersionBar statusBarView(int i, View view) {
        return statusBarView(view.findViewById(i));
    }

    public static void setTitleBarMarginTop(Activity activity, View view) {
        if (activity != null && view != null) {
            int i = Build.VERSION.SDK_INT;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin + getStatusBarHeight(activity), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    public ImmersionBar addViewSupportTransformColorInt(View view, int i) {
        if (view != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(Integer.valueOf(this.mBarParams.statusBarColor), Integer.valueOf(i));
            this.mBarParams.viewMap.put(view, hashMap);
            return this;
        }
        throw new IllegalArgumentException("view cannot be null");
    }

    public ImmersionBar titleBar(int i, boolean z) {
        Fragment fragment = this.mFragment;
        if (fragment == null || fragment.getView() == null) {
            return titleBar(this.mActivity.findViewById(i), z);
        }
        return titleBar(this.mFragment.getView().findViewById(i), z);
    }

    public static void setTitleBar(final Activity activity, final View view) {
        if (activity != null && view != null) {
            int i = Build.VERSION.SDK_INT;
            final ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams.height == -2 || layoutParams.height == -1) {
                view.post(new Runnable() {
                    /* class com.gyf.barlibrary.ImmersionBar.RunnableC280522 */

                    static {
                        Covode.recordClassIndex(33738);
                    }

                    public final void run() {
                        layoutParams.height = view.getHeight() + ImmersionBar.getStatusBarHeight(activity);
                        View view = view;
                        view.setPadding(view.getPaddingLeft(), view.getPaddingTop() + ImmersionBar.getStatusBarHeight(activity), view.getPaddingRight(), view.getPaddingBottom());
                    }
                });
                return;
            }
            layoutParams.height += getStatusBarHeight(activity);
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop() + getStatusBarHeight(activity), view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public static ImmersionBar with(Activity activity, Dialog dialog) {
        ImmersionBar immersionBar = mImmersionBarMap.get(activity.toString() + dialog.toString());
        if (immersionBar != null) {
            return immersionBar;
        }
        ImmersionBar immersionBar2 = new ImmersionBar(activity, dialog);
        mImmersionBarMap.put(activity.toString() + dialog.toString(), immersionBar2);
        return immersionBar2;
    }

    public ImmersionBar addViewSupportTransformColor(View view, String str) {
        return addViewSupportTransformColorInt(view, Color.parseColor(str));
    }

    public ImmersionBar barColor(String str, float f) {
        return barColorInt(Color.parseColor(str), f);
    }

    public ImmersionBar navigationBarColor(String str, float f) {
        return navigationBarColorInt(Color.parseColor(str), f);
    }

    public ImmersionBar statusBarColor(String str, float f) {
        return statusBarColorInt(Color.parseColor(str), f);
    }

    public ImmersionBar titleBar(View view, boolean z) {
        if (view == null) {
            return this;
        }
        if (this.mFitsStatusBarType == 0) {
            this.mFitsStatusBarType = 1;
        }
        this.mBarParams.titleBarView = view;
        this.mBarParams.statusBarColorEnabled = z;
        return this;
    }

    private ImmersionBar(Activity activity, Fragment fragment) {
        this.mTagMap = new HashMap();
        this.mIsFitsLayoutOverlap = false;
        this.mFitsStatusBarType = 0;
        this.mHasNavigationBarColor = false;
        this.mIsFitsNotch = false;
        this.mPaddingLeft = 0;
        this.mPaddingTop = 0;
        this.mPaddingRight = 0;
        this.mPaddingBottom = 0;
        this.mActivity = activity;
        this.mFragment = fragment;
        if (activity == null) {
            throw new IllegalArgumentException("Activity cannot be null!!!");
        } else if (mImmersionBarMap.get(activity.toString()) != null) {
            this.mIsFragment = true;
            this.mWindow = this.mActivity.getWindow();
            this.mImmersionBarName = activity.toString() + fragment.toString();
            initParams();
        } else {
            throw new IllegalArgumentException("you should initialize ImmersionBar in Activity first if used in Fragment");
        }
    }

    public static ImmersionBar with(Activity activity, Fragment fragment) {
        ImmersionBar immersionBar = mImmersionBarMap.get(activity.toString() + fragment.toString());
        if (immersionBar != null) {
            return immersionBar;
        }
        ImmersionBar immersionBar2 = new ImmersionBar(activity, fragment);
        mImmersionBarMap.put(activity.toString() + fragment.toString(), immersionBar2);
        return immersionBar2;
    }

    private ImmersionBar(DialogInterface$OnCancelListenerC0944d dVar, Dialog dialog) {
        this.mTagMap = new HashMap();
        this.mIsFitsLayoutOverlap = false;
        this.mFitsStatusBarType = 0;
        this.mHasNavigationBarColor = false;
        this.mIsFitsNotch = false;
        this.mPaddingLeft = 0;
        this.mPaddingTop = 0;
        this.mPaddingRight = 0;
        this.mPaddingBottom = 0;
        ActivityC0945e activity = dVar.getActivity();
        this.mActivity = activity;
        this.mFragment = dVar;
        this.mDialog = dialog;
        if (activity == null) {
            throw new IllegalArgumentException("Activity cannot be null!!!");
        } else if (dialog == null) {
            throw new IllegalArgumentException("dialog in DialogFragment cannot be null");
        } else if (mImmersionBarMap.get(activity.toString()) != null) {
            this.mWindow = this.mDialog.getWindow();
            this.mImmersionBarName = this.mActivity.toString() + dVar.toString();
            initParams();
        } else {
            throw new IllegalArgumentException("you should initialize ImmersionBar in Activity first if used in Fragment");
        }
    }

    public static ImmersionBar with(DialogInterface$OnCancelListenerC0944d dVar, Dialog dialog) {
        if (dVar.getActivity() != null) {
            ImmersionBar immersionBar = mImmersionBarMap.get(dVar.getActivity().toString() + dVar.toString());
            if (immersionBar != null) {
                return immersionBar;
            }
            ImmersionBar immersionBar2 = new ImmersionBar(dVar, dialog);
            mImmersionBarMap.put(dVar.getActivity().toString() + dVar.toString(), immersionBar2);
            return immersionBar2;
        }
        throw new IllegalArgumentException("Activity cannot be null!!!");
    }

    public ImmersionBar statusBarColorInt(int i, int i2, float f) {
        this.mBarParams.statusBarColor = i;
        this.mBarParams.statusBarColorTransform = i2;
        this.mBarParams.statusBarAlpha = f;
        return this;
    }

    public ImmersionBar titleBar(int i, View view, boolean z) {
        return titleBar(view.findViewById(i), z);
    }

    public ImmersionBar addViewSupportTransformColor(View view, int i, int i2) {
        return addViewSupportTransformColorInt(view, C0643b.m2378c(this.mActivity, i), C0643b.m2378c(this.mActivity, i2));
    }

    public ImmersionBar barColor(int i, int i2, float f) {
        return barColorInt(C0643b.m2378c(this.mActivity, i), C0643b.m2378c(this.mActivity, i2), f);
    }

    public ImmersionBar barColorInt(int i, int i2, float f) {
        this.mBarParams.statusBarColor = i;
        this.mBarParams.navigationBarColor = i;
        this.mBarParams.useDefaultNavigationBarColor = false;
        this.mBarParams.statusBarColorTransform = i2;
        this.mBarParams.navigationBarColorTransform = i2;
        this.mBarParams.statusBarAlpha = f;
        this.mBarParams.navigationBarAlpha = f;
        return this;
    }

    public ImmersionBar navigationBarColor(int i, int i2, float f) {
        return navigationBarColorInt(C0643b.m2378c(this.mActivity, i), C0643b.m2378c(this.mActivity, i2), f);
    }

    public ImmersionBar navigationBarColorInt(int i, int i2, float f) {
        this.mBarParams.navigationBarColor = i;
        this.mBarParams.useDefaultNavigationBarColor = false;
        this.mBarParams.navigationBarColorTransform = i2;
        this.mBarParams.navigationBarAlpha = f;
        return this;
    }

    public ImmersionBar statusBarColor(int i, int i2, float f) {
        return statusBarColorInt(C0643b.m2378c(this.mActivity, i), C0643b.m2378c(this.mActivity, i2), f);
    }

    private void setMIUIBarDark(Window window, String str, boolean z) {
        if (window != null) {
            Class<?> cls = window.getClass();
            try {
                Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
                int i = cls2.getField(str).getInt(cls2);
                Method method = cls.getMethod("setExtraFlags", Integer.TYPE, Integer.TYPE);
                if (z) {
                    method.invoke(window, Integer.valueOf(i), Integer.valueOf(i));
                    return;
                }
                method.invoke(window, 0, Integer.valueOf(i));
            } catch (Exception unused) {
            }
        }
    }

    public ImmersionBar addViewSupportTransformColorInt(View view, int i, int i2) {
        if (view != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(Integer.valueOf(i), Integer.valueOf(i2));
            this.mBarParams.viewMap.put(view, hashMap);
            return this;
        }
        throw new IllegalArgumentException("view cannot be null");
    }

    private ImmersionBar(Activity activity, Dialog dialog, String str) {
        this.mTagMap = new HashMap();
        this.mIsFitsLayoutOverlap = false;
        this.mFitsStatusBarType = 0;
        this.mHasNavigationBarColor = false;
        this.mIsFitsNotch = false;
        this.mPaddingLeft = 0;
        this.mPaddingTop = 0;
        this.mPaddingRight = 0;
        this.mPaddingBottom = 0;
        this.mActivity = activity;
        this.mDialog = dialog;
        if (activity == null) {
            throw new IllegalArgumentException("Activity cannot be null!!!");
        } else if (dialog == null) {
            throw new IllegalArgumentException("dialog cannot be null");
        } else if (mImmersionBarMap.get(activity.toString()) != null) {
            this.mWindow = this.mDialog.getWindow();
            this.mImmersionBarName = activity.toString() + dialog.toString() + str;
            initParams();
        } else {
            throw new IllegalArgumentException("you should initialize ImmersionBar in Activity first if used in Fragment");
        }
    }

    public static ImmersionBar with(Activity activity, Dialog dialog, String str) {
        ImmersionBar immersionBar = mImmersionBarMap.get(activity.toString() + dialog.toString() + str);
        if (immersionBar != null) {
            return immersionBar;
        }
        ImmersionBar immersionBar2 = new ImmersionBar(activity, dialog, str);
        mImmersionBarMap.put(activity.toString() + dialog.toString() + str, immersionBar2);
        return immersionBar2;
    }

    public ImmersionBar addViewSupportTransformColor(View view, String str, String str2) {
        return addViewSupportTransformColorInt(view, Color.parseColor(str), Color.parseColor(str2));
    }

    public ImmersionBar barColor(String str, String str2, float f) {
        return barColorInt(Color.parseColor(str), Color.parseColor(str2), f);
    }

    public ImmersionBar navigationBarColor(String str, String str2, float f) {
        return navigationBarColorInt(Color.parseColor(str), Color.parseColor(str2), f);
    }

    public ImmersionBar statusBarColor(String str, String str2, float f) {
        return statusBarColorInt(Color.parseColor(str), Color.parseColor(str2), f);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        ViewGroup viewGroup = this.mContentView;
        if (viewGroup != null) {
            viewGroup.setPadding(i, i2, i3, i4);
        }
        this.mPaddingLeft = i;
        this.mPaddingTop = i2;
        this.mPaddingRight = i3;
        this.mPaddingBottom = i4;
    }

    public ImmersionBar fitsSystemWindows(boolean z, int i, int i2, float f) {
        return fitsSystemWindowsInt(z, C0643b.m2378c(this.mActivity, i), C0643b.m2378c(this.mActivity, i2), f);
    }

    public ImmersionBar fitsSystemWindowsInt(boolean z, int i, int i2, float f) {
        this.mBarParams.fits = z;
        this.mBarParams.contentColor = i;
        this.mBarParams.contentColorTransform = i2;
        this.mBarParams.contentAlpha = f;
        if (!this.mBarParams.fits) {
            this.mFitsStatusBarType = 0;
        } else if (this.mFitsStatusBarType == 0) {
            this.mFitsStatusBarType = 4;
        }
        this.mContentView.setBackgroundColor(C0699a.m2465b(this.mBarParams.contentColor, this.mBarParams.contentColorTransform, this.mBarParams.contentAlpha));
        return this;
    }
}
