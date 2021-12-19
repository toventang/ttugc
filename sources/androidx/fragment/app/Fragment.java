package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.AbstractC0618p;
import androidx.core.p036g.C0689b;
import androidx.core.p037h.C0777g;
import androidx.lifecycle.AbstractC1183ag;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1182af;
import androidx.lifecycle.C1205n;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import androidx.loader.app.AbstractC1247a;
import androidx.p025c.C0497g;
import com.bytedance.covode.number.Covode;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, AbstractC1183ag, AbstractC1204m {
    static final Object USE_DEFAULT_TRANSITION = new Object();
    private static final C0497g<String, Class<?>> sClassMap = new C0497g<>();
    boolean mAdded;
    C0934a mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mCalled;
    LayoutInflater$Factory2C0956j mChildFragmentManager;
    C0973k mChildNonConfig;
    ViewGroup mContainer;
    int mContainerId;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    LayoutInflater$Factory2C0956j mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    AbstractC0951h mHost;
    boolean mInLayout;
    int mIndex = -1;
    View mInnerView;
    boolean mIsCreated;
    boolean mIsNewlyAdded;
    LayoutInflater mLayoutInflater;
    C1205n mLifecycleRegistry = new C1205n(this);
    boolean mMenuVisible = true;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    float mPostponedAlpha;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetaining;
    Bundle mSavedFragmentState;
    Boolean mSavedUserVisibleHint;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetIndex = -1;
    int mTargetRequestCode;
    boolean mUserVisibleHint = true;
    View mView;
    AbstractC1204m mViewLifecycleOwner;
    C1213t<AbstractC1204m> mViewLifecycleOwnerLiveData = new C1213t<>();
    C1205n mViewLifecycleRegistry;
    C1182af mViewModelStore;
    String mWho;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.Fragment$c */
    public interface AbstractC0936c {
        static {
            Covode.recordClassIndex(1027);
        }

        /* renamed from: a */
        void mo3438a();

        /* renamed from: b */
        void mo3439b();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttachFragment(Fragment fragment) {
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final AbstractC0952i getFragmentManager() {
        return this.mFragmentManager;
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @Override // androidx.lifecycle.AbstractC1204m
    public AbstractC1196i getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final boolean getRetainInstance() {
        return this.mRetainInstance;
    }

    public final String getTag() {
        return this.mTag;
    }

    public final Fragment getTargetFragment() {
        return this.mTarget;
    }

    public final int getTargetRequestCode() {
        return this.mTargetRequestCode;
    }

    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public LiveData<AbstractC1204m> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        return this.mHidden;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        return this.mMenuVisible;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    /* access modifiers changed from: package-private */
    public AbstractC0952i peekChildFragmentManager() {
        return this.mChildFragmentManager;
    }

    public AbstractC1247a getLoaderManager() {
        return AbstractC1247a.m3990a(this);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* access modifiers changed from: package-private */
    public final boolean isInBackStack() {
        if (this.mBackStackNesting > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void noteStateNotSaved() {
        LayoutInflater$Factory2C0956j jVar = this.mChildFragmentManager;
        if (jVar != null) {
            jVar.mo3613l();
        }
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f3327q = true;
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class androidx.fragment.app.Fragment.SavedState.C09331 */

            static {
                Covode.recordClassIndex(1024);
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
        final Bundle f3310a;

        public int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(1023);
        }

        SavedState(Bundle bundle) {
            this.f3310a = bundle;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f3310a);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f3310a = readBundle;
            if (classLoader != null && readBundle != null) {
                readBundle.setClassLoader(classLoader);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.Fragment$a */
    public static class C0934a {

        /* renamed from: a */
        View f3311a;

        /* renamed from: b */
        Animator f3312b;

        /* renamed from: c */
        int f3313c;

        /* renamed from: d */
        int f3314d;

        /* renamed from: e */
        int f3315e;

        /* renamed from: f */
        int f3316f;

        /* renamed from: g */
        Object f3317g;

        /* renamed from: h */
        Object f3318h = Fragment.USE_DEFAULT_TRANSITION;

        /* renamed from: i */
        Object f3319i;

        /* renamed from: j */
        Object f3320j = Fragment.USE_DEFAULT_TRANSITION;

        /* renamed from: k */
        Object f3321k;

        /* renamed from: l */
        Object f3322l = Fragment.USE_DEFAULT_TRANSITION;

        /* renamed from: m */
        Boolean f3323m;

        /* renamed from: n */
        Boolean f3324n;

        /* renamed from: o */
        AbstractC0618p f3325o;

        /* renamed from: p */
        AbstractC0618p f3326p;

        /* renamed from: q */
        boolean f3327q;

        /* renamed from: r */
        AbstractC0936c f3328r;

        /* renamed from: s */
        boolean f3329s;

        static {
            Covode.recordClassIndex(1025);
        }

        C0934a() {
        }
    }

    private C0934a ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new C0934a();
        }
        return this.mAnimationInfo;
    }

    public final ActivityC0945e getActivity() {
        AbstractC0951h hVar = this.mHost;
        if (hVar == null) {
            return null;
        }
        return (ActivityC0945e) hVar.f3382b;
    }

    /* access modifiers changed from: package-private */
    public View getAnimatingAway() {
        C0934a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return null;
        }
        return aVar.f3311a;
    }

    /* access modifiers changed from: package-private */
    public Animator getAnimator() {
        C0934a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return null;
        }
        return aVar.f3312b;
    }

    public Context getContext() {
        AbstractC0951h hVar = this.mHost;
        if (hVar == null) {
            return null;
        }
        return hVar.f3383c;
    }

    public Object getEnterTransition() {
        C0934a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return null;
        }
        return aVar.f3317g;
    }

    /* access modifiers changed from: package-private */
    public AbstractC0618p getEnterTransitionCallback() {
        C0934a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return null;
        }
        return aVar.f3325o;
    }

    public Object getExitTransition() {
        C0934a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return null;
        }
        return aVar.f3319i;
    }

    /* access modifiers changed from: package-private */
    public AbstractC0618p getExitTransitionCallback() {
        C0934a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return null;
        }
        return aVar.f3326p;
    }

    public final Object getHost() {
        AbstractC0951h hVar = this.mHost;
        if (hVar == null) {
            return null;
        }
        return hVar.mo3544g();
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        if (layoutInflater == null) {
            return performGetLayoutInflater(null);
        }
        return layoutInflater;
    }

    /* access modifiers changed from: package-private */
    public int getNextAnim() {
        C0934a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return 0;
        }
        return aVar.f3314d;
    }

    /* access modifiers changed from: package-private */
    public int getNextTransition() {
        C0934a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return 0;
        }
        return aVar.f3315e;
    }

    /* access modifiers changed from: package-private */
    public int getNextTransitionStyle() {
        C0934a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return 0;
        }
        return aVar.f3316f;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    public Object getSharedElementEnterTransition() {
        C0934a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return null;
        }
        return aVar.f3321k;
    }

    /* access modifiers changed from: package-private */
    public int getStateAfterAnimating() {
        C0934a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return 0;
        }
        return aVar.f3313c;
    }

    public AbstractC1204m getViewLifecycleOwner() {
        AbstractC1204m mVar = this.mViewLifecycleOwner;
        if (mVar != null) {
            return mVar;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public final boolean isAdded() {
        if (this.mHost == null || !this.mAdded) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean isHideReplaced() {
        C0934a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return false;
        }
        return aVar.f3329s;
    }

    /* access modifiers changed from: package-private */
    public boolean isPostponed() {
        C0934a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return false;
        }
        return aVar.f3327q;
    }

    public final boolean isResumed() {
        if (this.mState >= 4) {
            return true;
        }
        return false;
    }

    public final boolean isStateSaved() {
        LayoutInflater$Factory2C0956j jVar = this.mFragmentManager;
        if (jVar == null) {
            return false;
        }
        return jVar.mo3567h();
    }

    /* access modifiers changed from: package-private */
    public void performLowMemory() {
        onLowMemory();
        LayoutInflater$Factory2C0956j jVar = this.mChildFragmentManager;
        if (jVar != null) {
            jVar.mo3622s();
        }
    }

    static {
        Covode.recordClassIndex(1019);
    }

    /* access modifiers changed from: package-private */
    public void callStartTransitionListener() {
        C0934a aVar = this.mAnimationInfo;
        if (aVar != null) {
            aVar.f3327q = false;
            AbstractC0936c cVar = this.mAnimationInfo.f3328r;
            this.mAnimationInfo.f3328r = null;
            if (cVar != null) {
                cVar.mo3438a();
            }
        }
    }

    public boolean getAllowEnterTransitionOverlap() {
        C0934a aVar = this.mAnimationInfo;
        if (aVar == null || aVar.f3324n == null) {
            return true;
        }
        return this.mAnimationInfo.f3324n.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        C0934a aVar = this.mAnimationInfo;
        if (aVar == null || aVar.f3323m == null) {
            return true;
        }
        return this.mAnimationInfo.f3323m.booleanValue();
    }

    public Object getReenterTransition() {
        C0934a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return null;
        }
        if (aVar.f3320j == USE_DEFAULT_TRANSITION) {
            return getExitTransition();
        }
        return this.mAnimationInfo.f3320j;
    }

    public Object getReturnTransition() {
        C0934a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return null;
        }
        if (aVar.f3318h == USE_DEFAULT_TRANSITION) {
            return getEnterTransition();
        }
        return this.mAnimationInfo.f3318h;
    }

    public Object getSharedElementReturnTransition() {
        C0934a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return null;
        }
        if (aVar.f3322l == USE_DEFAULT_TRANSITION) {
            return getSharedElementEnterTransition();
        }
        return this.mAnimationInfo.f3322l;
    }

    @Override // androidx.lifecycle.AbstractC1183ag
    public C1182af getViewModelStore() {
        if (getContext() != null) {
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new C1182af();
            }
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* access modifiers changed from: package-private */
    public void instantiateChildFragmentManager() {
        if (this.mHost != null) {
            LayoutInflater$Factory2C0956j jVar = new LayoutInflater$Factory2C0956j();
            this.mChildFragmentManager = jVar;
            jVar.mo3590a(this.mHost, new AbstractC0949f() {
                /* class androidx.fragment.app.Fragment.C09312 */

                static {
                    Covode.recordClassIndex(1021);
                }

                @Override // androidx.fragment.app.AbstractC0949f
                /* renamed from: a */
                public final boolean mo3432a() {
                    if (Fragment.this.mView != null) {
                        return true;
                    }
                    return false;
                }

                @Override // androidx.fragment.app.AbstractC0949f
                /* renamed from: a */
                public final View mo3430a(int i) {
                    if (Fragment.this.mView != null) {
                        return Fragment.this.mView.findViewById(i);
                    }
                    throw new IllegalStateException("Fragment does not have a view");
                }

                @Override // androidx.fragment.app.AbstractC0949f
                /* renamed from: a */
                public final Fragment mo3431a(Context context, String str, Bundle bundle) {
                    return Fragment.this.mHost.mo3431a(context, str, bundle);
                }
            }, this);
            return;
        }
        throw new IllegalStateException("Fragment has not been attached yet.");
    }

    public void onDestroy() {
        boolean z = true;
        this.mCalled = true;
        ActivityC0945e activity = getActivity();
        if (activity == null || !activity.isChangingConfigurations()) {
            z = false;
        }
        C1182af afVar = this.mViewModelStore;
        if (afVar != null && !z) {
            afVar.mo3997a();
        }
    }

    public final AbstractC0952i getChildFragmentManager() {
        if (this.mChildFragmentManager == null) {
            instantiateChildFragmentManager();
            int i = this.mState;
            if (i >= 4) {
                this.mChildFragmentManager.mo3619p();
            } else if (i >= 3) {
                this.mChildFragmentManager.mo3616o();
            } else if (i >= 2) {
                this.mChildFragmentManager.mo3615n();
            } else if (i > 0) {
                this.mChildFragmentManager.mo3614m();
            }
        }
        return this.mChildFragmentManager;
    }

    /* access modifiers changed from: package-private */
    public void initState() {
        this.mIndex = -1;
        this.mWho = null;
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = null;
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
        this.mRetaining = false;
    }

    public final boolean isVisible() {
        View view;
        if (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void performDestroy() {
        this.mLifecycleRegistry.mo4016a(AbstractC1196i.EnumC1198a.ON_DESTROY);
        LayoutInflater$Factory2C0956j jVar = this.mChildFragmentManager;
        if (jVar != null) {
            jVar.mo3621r();
        }
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            this.mChildFragmentManager = null;
            return;
        }
        throw new C0993s("Fragment " + this + " did not call through to super.onDestroy()");
    }

    public final ActivityC0945e requireActivity() {
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final AbstractC0952i requireFragmentManager() {
        AbstractC0952i fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    public void startPostponedEnterTransition() {
        LayoutInflater$Factory2C0956j jVar = this.mFragmentManager;
        if (jVar == null || jVar.f3409m == null) {
            ensureAnimationInfo().f3327q = false;
        } else if (Looper.myLooper() != this.mFragmentManager.f3409m.f3384d.getLooper()) {
            this.mFragmentManager.f3409m.f3384d.postAtFrontOfQueue(new Runnable() {
                /* class androidx.fragment.app.Fragment.RunnableC09301 */

                static {
                    Covode.recordClassIndex(1020);
                }

                public final void run() {
                    Fragment.this.callStartTransitionListener();
                }
            });
        } else {
            callStartTransitionListener();
        }
    }

    /* access modifiers changed from: package-private */
    public void performDestroyView() {
        if (this.mView != null) {
            this.mViewLifecycleRegistry.mo4016a(AbstractC1196i.EnumC1198a.ON_DESTROY);
        }
        LayoutInflater$Factory2C0956j jVar = this.mChildFragmentManager;
        if (jVar != null) {
            jVar.mo3604d(1);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            AbstractC1247a.m3990a(this).mo4098a();
            this.mPerformedCreateView = false;
            return;
        }
        throw new C0993s("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    /* access modifiers changed from: package-private */
    public void performDetach() {
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            LayoutInflater$Factory2C0956j jVar = this.mChildFragmentManager;
            if (jVar == null) {
                return;
            }
            if (this.mRetaining) {
                jVar.mo3621r();
                this.mChildFragmentManager = null;
                return;
            }
            throw new IllegalStateException("Child FragmentManager of " + this + " was not  destroyed and this fragment is not retaining instance");
        }
        throw new C0993s("Fragment " + this + " did not call through to super.onDetach()");
    }

    /* access modifiers changed from: package-private */
    public void performPause() {
        if (this.mView != null) {
            this.mViewLifecycleRegistry.mo4016a(AbstractC1196i.EnumC1198a.ON_PAUSE);
        }
        this.mLifecycleRegistry.mo4016a(AbstractC1196i.EnumC1198a.ON_PAUSE);
        LayoutInflater$Factory2C0956j jVar = this.mChildFragmentManager;
        if (jVar != null) {
            jVar.mo3604d(3);
        }
        this.mState = 3;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new C0993s("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    /* access modifiers changed from: package-private */
    public void performResume() {
        LayoutInflater$Factory2C0956j jVar = this.mChildFragmentManager;
        if (jVar != null) {
            jVar.mo3613l();
            this.mChildFragmentManager.mo3611j();
        }
        this.mState = 4;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            LayoutInflater$Factory2C0956j jVar2 = this.mChildFragmentManager;
            if (jVar2 != null) {
                jVar2.mo3619p();
                this.mChildFragmentManager.mo3611j();
            }
            this.mLifecycleRegistry.mo4016a(AbstractC1196i.EnumC1198a.ON_RESUME);
            if (this.mView != null) {
                this.mViewLifecycleRegistry.mo4016a(AbstractC1196i.EnumC1198a.ON_RESUME);
                return;
            }
            return;
        }
        throw new C0993s("Fragment " + this + " did not call through to super.onResume()");
    }

    /* access modifiers changed from: package-private */
    public void performStart() {
        LayoutInflater$Factory2C0956j jVar = this.mChildFragmentManager;
        if (jVar != null) {
            jVar.mo3613l();
            this.mChildFragmentManager.mo3611j();
        }
        this.mState = 3;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            LayoutInflater$Factory2C0956j jVar2 = this.mChildFragmentManager;
            if (jVar2 != null) {
                jVar2.mo3616o();
            }
            this.mLifecycleRegistry.mo4016a(AbstractC1196i.EnumC1198a.ON_START);
            if (this.mView != null) {
                this.mViewLifecycleRegistry.mo4016a(AbstractC1196i.EnumC1198a.ON_START);
                return;
            }
            return;
        }
        throw new C0993s("Fragment " + this + " did not call through to super.onStart()");
    }

    /* access modifiers changed from: package-private */
    public void performStop() {
        if (this.mView != null) {
            this.mViewLifecycleRegistry.mo4016a(AbstractC1196i.EnumC1198a.ON_STOP);
        }
        this.mLifecycleRegistry.mo4016a(AbstractC1196i.EnumC1198a.ON_STOP);
        LayoutInflater$Factory2C0956j jVar = this.mChildFragmentManager;
        if (jVar != null) {
            jVar.mo3620q();
        }
        this.mState = 2;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new C0993s("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        C0689b.m2445a(this, sb);
        if (this.mIndex >= 0) {
            sb.append(" #");
            sb.append(this.mIndex);
        }
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" ");
            sb.append(this.mTag);
        }
        sb.append('}');
        return sb.toString();
    }

    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    public void setRetainInstance(boolean z) {
        this.mRetainInstance = z;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    /* access modifiers changed from: package-private */
    public void setAnimatingAway(View view) {
        ensureAnimationInfo().f3311a = view;
    }

    /* access modifiers changed from: package-private */
    public void setAnimator(Animator animator) {
        ensureAnimationInfo().f3312b = animator;
    }

    public void setEnterSharedElementCallback(AbstractC0618p pVar) {
        ensureAnimationInfo().f3325o = pVar;
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().f3317g = obj;
    }

    public void setExitSharedElementCallback(AbstractC0618p pVar) {
        ensureAnimationInfo().f3326p = pVar;
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().f3319i = obj;
    }

    /* access modifiers changed from: package-private */
    public void setHideReplaced(boolean z) {
        ensureAnimationInfo().f3329s = z;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().f3320j = obj;
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().f3318h = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().f3321k = obj;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().f3322l = obj;
    }

    /* access modifiers changed from: package-private */
    public void setStateAfterAnimating(int i) {
        ensureAnimationInfo().f3313c = i;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    /* access modifiers changed from: package-private */
    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
        LayoutInflater$Factory2C0956j jVar = this.mChildFragmentManager;
        if (jVar != null) {
            jVar.mo3585a(configuration);
        }
    }

    /* access modifiers changed from: package-private */
    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
        LayoutInflater$Factory2C0956j jVar = this.mChildFragmentManager;
        if (jVar != null) {
            jVar.mo3592a(z);
        }
    }

    /* access modifiers changed from: package-private */
    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
        LayoutInflater$Factory2C0956j jVar = this.mChildFragmentManager;
        if (jVar != null) {
            jVar.mo3601b(z);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().f3324n = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().f3323m = Boolean.valueOf(z);
    }

    /* access modifiers changed from: package-private */
    public void setNextAnim(int i) {
        if (this.mAnimationInfo != null || i != 0) {
            ensureAnimationInfo().f3314d = i;
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        AbstractC0951h hVar = this.mHost;
        if (hVar != null) {
            return hVar.mo3538a(str);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public Fragment findFragmentByWho(String str) {
        if (str.equals(this.mWho)) {
            return this;
        }
        LayoutInflater$Factory2C0956j jVar = this.mChildFragmentManager;
        if (jVar != null) {
            return jVar.mo3597b(str);
        }
        return null;
    }

    public LayoutInflater getLayoutInflater(Bundle bundle) {
        AbstractC0951h hVar = this.mHost;
        if (hVar != null) {
            LayoutInflater c = hVar.mo3540c();
            getChildFragmentManager();
            C0777g.m2700a(c, this.mChildFragmentManager);
            return c;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void onAttach(Context context) {
        Activity activity;
        this.mCalled = true;
        AbstractC0951h hVar = this.mHost;
        if (hVar != null && (activity = hVar.f3382b) != null) {
            this.mCalled = false;
            onAttach(activity);
        }
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        LayoutInflater$Factory2C0956j jVar = this.mChildFragmentManager;
        if (jVar != null && jVar.f3408l <= 0) {
            this.mChildFragmentManager.mo3614m();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        LayoutInflater$Factory2C0956j jVar = this.mChildFragmentManager;
        if (jVar == null || !jVar.mo3602b(menuItem)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void performOptionsMenuClosed(Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            LayoutInflater$Factory2C0956j jVar = this.mChildFragmentManager;
            if (jVar != null) {
                jVar.mo3598b(menu);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z = true;
        }
        LayoutInflater$Factory2C0956j jVar = this.mChildFragmentManager;
        if (jVar != null) {
            return z | jVar.mo3593a(menu);
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public void performSaveInstanceState(Bundle bundle) {
        Parcelable k;
        onSaveInstanceState(bundle);
        LayoutInflater$Factory2C0956j jVar = this.mChildFragmentManager;
        if (jVar != null && (k = jVar.mo3612k()) != null) {
            bundle.putParcelable("android:support:fragments", k);
        }
    }

    public void setArguments(Bundle bundle) {
        if (this.mIndex < 0 || !isStateSaved()) {
            this.mArguments = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already active and state has been saved");
    }

    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (isAdded() && !isHidden()) {
                this.mHost.mo3541d();
            }
        }
    }

    public void setInitialSavedState(SavedState savedState) {
        Bundle bundle;
        if (this.mIndex < 0) {
            if (savedState == null || savedState.f3310a == null) {
                bundle = null;
            } else {
                bundle = savedState.f3310a;
            }
            this.mSavedFragmentState = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already active");
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.mo3541d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void performActivityCreated(Bundle bundle) {
        LayoutInflater$Factory2C0956j jVar = this.mChildFragmentManager;
        if (jVar != null) {
            jVar.mo3613l();
        }
        this.mState = 2;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            LayoutInflater$Factory2C0956j jVar2 = this.mChildFragmentManager;
            if (jVar2 != null) {
                jVar2.mo3615n();
                return;
            }
            return;
        }
        throw new C0993s("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    /* access modifiers changed from: package-private */
    public void performCreate(Bundle bundle) {
        LayoutInflater$Factory2C0956j jVar = this.mChildFragmentManager;
        if (jVar != null) {
            jVar.mo3613l();
        }
        this.mState = 1;
        this.mCalled = false;
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.mo4016a(AbstractC1196i.EnumC1198a.ON_CREATE);
            return;
        }
        throw new C0993s("Fragment " + this + " did not call through to super.onCreate()");
    }

    /* access modifiers changed from: package-private */
    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        LayoutInflater$Factory2C0956j jVar = this.mChildFragmentManager;
        if (jVar == null || !jVar.mo3595a(menuItem)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void restoreChildFragmentState(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            if (this.mChildFragmentManager == null) {
                instantiateChildFragmentManager();
            }
            this.mChildFragmentManager.mo3586a(parcelable, this.mChildNonConfig);
            this.mChildNonConfig = null;
            this.mChildFragmentManager.mo3614m();
        }
    }

    /* access modifiers changed from: package-private */
    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mInnerView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new C0993s("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.mView != null) {
            this.mViewLifecycleRegistry.mo4016a(AbstractC1196i.EnumC1198a.ON_CREATE);
        }
    }

    /* access modifiers changed from: package-private */
    public void setOnStartEnterTransitionListener(AbstractC0936c cVar) {
        ensureAnimationInfo();
        if (cVar != this.mAnimationInfo.f3328r) {
            if (cVar == null || this.mAnimationInfo.f3328r == null) {
                if (this.mAnimationInfo.f3327q) {
                    this.mAnimationInfo.f3328r = cVar;
                }
                if (cVar != null) {
                    cVar.mo3439b();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on ".concat(String.valueOf(this)));
        }
    }

    public void setUserVisibleHint(boolean z) {
        boolean z2;
        if (!this.mUserVisibleHint && z && this.mState < 3 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            this.mFragmentManager.mo3599b(this);
        }
        this.mUserVisibleHint = z;
        if (this.mState >= 3 || z) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.mDeferStart = z2;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$b */
    public static class C0935b extends RuntimeException {
        static {
            Covode.recordClassIndex(1026);
        }

        public C0935b(String str, Exception exc) {
            super(str, exc);
        }
    }

    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    public void startActivityForResult(Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    static boolean isSupportFragmentClass(Context context, String str) {
        try {
            C0497g<String, Class<?>> gVar = sClassMap;
            Class<?> cls = gVar.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                gVar.put(str, cls);
            }
            return Fragment.class.isAssignableFrom(cls);
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    /* access modifiers changed from: package-private */
    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z = true;
        }
        LayoutInflater$Factory2C0956j jVar = this.mChildFragmentManager;
        if (jVar != null) {
            return z | jVar.mo3594a(menu, menuInflater);
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public void setNextTransition(int i, int i2) {
        if (this.mAnimationInfo != null || i != 0 || i2 != 0) {
            ensureAnimationInfo();
            this.mAnimationInfo.f3315e = i;
            this.mAnimationInfo.f3316f = i2;
        }
    }

    public final void requestPermissions(String[] strArr, int i) {
        AbstractC0951h hVar = this.mHost;
        if (hVar != null) {
            hVar.mo3536a(this, strArr, i);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* access modifiers changed from: package-private */
    public final void setIndex(int i, Fragment fragment) {
        this.mIndex = i;
        if (fragment != null) {
            this.mWho = fragment.mWho + ":" + this.mIndex;
        } else {
            this.mWho = "android:fragment:" + this.mIndex;
        }
    }

    public void startActivity(Intent intent, Bundle bundle) {
        AbstractC0951h hVar = this.mHost;
        if (hVar != null) {
            hVar.mo3534a(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public void setTargetFragment(Fragment fragment, int i) {
        AbstractC0952i iVar;
        AbstractC0952i fragmentManager = getFragmentManager();
        if (fragment != null) {
            iVar = fragment.getFragmentManager();
        } else {
            iVar = null;
        }
        if (fragmentManager == null || iVar == null || fragmentManager == iVar) {
            for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getTargetFragment()) {
                if (fragment2 == this) {
                    throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
                }
            }
            this.mTarget = fragment;
            this.mTargetRequestCode = i;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        getActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        Activity activity;
        this.mCalled = true;
        AbstractC0951h hVar = this.mHost;
        if (hVar != null && (activity = hVar.f3382b) != null) {
            this.mCalled = false;
            onInflate(activity, attributeSet, bundle);
        }
    }

    /* access modifiers changed from: package-private */
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater$Factory2C0956j jVar = this.mChildFragmentManager;
        if (jVar != null) {
            jVar.mo3613l();
        }
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new AbstractC1204m() {
            /* class androidx.fragment.app.Fragment.C09323 */

            static {
                Covode.recordClassIndex(1022);
            }

            @Override // androidx.lifecycle.AbstractC1204m
            public final AbstractC1196i getLifecycle() {
                if (Fragment.this.mViewLifecycleRegistry == null) {
                    Fragment.this.mViewLifecycleRegistry = new C1205n(Fragment.this.mViewLifecycleOwner);
                }
                return Fragment.this.mViewLifecycleRegistry;
            }
        };
        this.mViewLifecycleRegistry = null;
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView != null) {
            this.mViewLifecycleOwner.getLifecycle();
            this.mViewLifecycleOwnerLiveData.setValue(this.mViewLifecycleOwner);
        } else if (this.mViewLifecycleRegistry == null) {
            this.mViewLifecycleOwner = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        AbstractC0951h hVar = this.mHost;
        if (hVar != null) {
            hVar.mo3534a(this, intent, i, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            C0497g<String, Class<?>> gVar = sClassMap;
            Class<?> cls = gVar.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                gVar.put(str, cls);
            }
            Fragment fragment = (Fragment) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (ClassNotFoundException e) {
            throw new C0935b("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (InstantiationException e2) {
            throw new C0935b("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (IllegalAccessException e3) {
            throw new C0935b("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new C0935b("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new C0935b("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mIndex=");
        printWriter.print(this.mIndex);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mRetaining=");
        printWriter.print(this.mRetaining);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mTarget != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.mTarget);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        if (getNextAnim() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(getNextAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (this.mInnerView != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(getStateAfterAnimating());
        }
        if (getContext() != null) {
            AbstractC1247a.m3990a(this).mo4100a(str, fileDescriptor, printWriter, strArr);
        }
        if (this.mChildFragmentManager != null) {
            printWriter.print(str);
            printWriter.println("Child " + this.mChildFragmentManager + ":");
            this.mChildFragmentManager.mo3557a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        AbstractC0951h hVar = this.mHost;
        if (hVar != null) {
            hVar.mo3535a(this, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }
}
