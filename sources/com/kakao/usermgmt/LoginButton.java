package com.kakao.usermgmt;

import android.app.Activity;
import android.app.Dialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.kakao.auth.AuthType;
import com.kakao.auth.KakaoSDK;
import com.kakao.auth.Session;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoginButton extends FrameLayout {
    private Fragment supportFragment;

    static {
        Covode.recordClassIndex(33984);
    }

    public Fragment getSupportFragment() {
        return this.supportFragment;
    }

    private Activity getActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        inflate(getContext(), R.layout.adt, this);
        setOnClickListener(new View.OnClickListener() {
            /* class com.kakao.usermgmt.LoginButton.View$OnClickListenerC281081 */

            static {
                Covode.recordClassIndex(33985);
            }

            public void onClick(View view) {
                LoginButton.this.onClickLoginButton(LoginButton.this.getAuthTypes());
            }
        });
    }

    /* access modifiers changed from: protected */
    public List<AuthType> getAuthTypes() {
        ArrayList arrayList = new ArrayList();
        if (Session.getCurrentSession().getAuthCodeManager().isTalkLoginAvailable()) {
            arrayList.add(AuthType.KAKAO_TALK);
            arrayList.add(AuthType.KAKAO_TALK_ONLY);
        }
        if (Session.getCurrentSession().getAuthCodeManager().isStoryLoginAvailable()) {
            arrayList.add(AuthType.KAKAO_STORY);
        }
        arrayList.add(AuthType.KAKAO_ACCOUNT);
        AuthType[] authTypes = KakaoSDK.getAdapter().getSessionConfig().getAuthTypes();
        if (authTypes == null || authTypes.length == 0 || (authTypes.length == 1 && authTypes[0] == AuthType.KAKAO_LOGIN_ALL)) {
            authTypes = AuthType.values();
        }
        arrayList.retainAll(Arrays.asList(authTypes));
        if (arrayList.contains(AuthType.KAKAO_TALK)) {
            arrayList.remove(AuthType.KAKAO_TALK_ONLY);
        }
        if (arrayList.size() == 0) {
            arrayList.add(AuthType.KAKAO_ACCOUNT);
        }
        return arrayList;
    }

    public void setSuportFragment(Fragment fragment) {
        this.supportFragment = fragment;
    }

    public void setSupportFragment(Fragment fragment) {
        this.supportFragment = fragment;
    }

    public LoginButton(Context context) {
        super(context);
        MethodCollector.m26663i(14304);
        MethodCollector.m26664o(14304);
    }

    private ListAdapter createLoginAdapter(final Item[] itemArr) {
        return new ArrayAdapter<Item>(getContext(), 17367057, 16908308, itemArr) {
            /* class com.kakao.usermgmt.LoginButton.C281092 */

            static {
                Covode.recordClassIndex(33986);
            }

            /* renamed from: com_kakao_usermgmt_LoginButton$2_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService */
            public static Object m56179xb1cb0468(Context context, String str) {
                Object obj;
                MethodCollector.m26663i(13702);
                if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                    if (!C58027i.f132247b && "connectivity".equals(str)) {
                        try {
                            new C21708b().mo35361a();
                            C58027i.f132247b = true;
                            obj = context.getSystemService(str);
                        } catch (Throwable unused) {
                        }
                    }
                    obj = context.getSystemService(str);
                } else if (C58027i.f132246a) {
                    synchronized (ClipboardManager.class) {
                        try {
                            obj = context.getSystemService(str);
                            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                                try {
                                    Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                    declaredField.setAccessible(true);
                                    declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                                } catch (Exception e) {
                                    C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                                }
                            }
                            C58027i.f132246a = false;
                        } finally {
                            MethodCollector.m26664o(13702);
                        }
                    }
                } else {
                    obj = context.getSystemService(str);
                }
                return obj;
            }

            public View getView(int i, View view, ViewGroup viewGroup) {
                if (view == null) {
                    view = C1764a.m5927a((LayoutInflater) m56179xb1cb0468(getContext(), "layout_inflater"), R.layout.ag8, viewGroup, false);
                }
                ImageView imageView = (ImageView) view.findViewById(R.id.cgp);
                if (Build.VERSION.SDK_INT >= 21) {
                    imageView.setImageDrawable(LoginButton.this.getResources().getDrawable(itemArr[i].icon, getContext().getTheme()));
                } else {
                    imageView.setImageDrawable(LoginButton.this.getResources().getDrawable(itemArr[i].icon));
                }
                ((TextView) view.findViewById(R.id.cgr)).setText(itemArr[i].textId);
                return view;
            }
        };
    }

    public void openSession(AuthType authType) {
        if (getSupportFragment() != null) {
            Session.getCurrentSession().open(authType, getSupportFragment());
        } else {
            Session.getCurrentSession().open(authType, (Activity) getContext());
        }
    }

    private void showDialogWhilePreservingSystemVisibility(Dialog dialog) {
        Window window = dialog.getWindow();
        if (window != null) {
            window.setFlags(8, 8);
        }
        dialog.show();
        if (getActivity() != null && window != null) {
            window.getDecorView().setSystemUiVisibility(getActivity().getWindow().getDecorView().getSystemUiVisibility());
            window.clearFlags(8);
        }
    }

    /* access modifiers changed from: protected */
    public void onClickLoginButton(List<AuthType> list) {
        if (list.size() == 1) {
            openSession(list.get(0));
            return;
        }
        Item[] createAuthItemArray = createAuthItemArray(list);
        showDialogWhilePreservingSystemVisibility(createLoginDialog(createAuthItemArray, createLoginAdapter(createAuthItemArray)));
    }

    private void applyFullscreenOptions(Dialog dialog) {
        int i;
        Activity activity = getActivity();
        if (activity != null) {
            Window window = activity.getWindow();
            Window window2 = dialog.getWindow();
            if (window != null && window2 != null) {
                int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
                int i2 = window.getAttributes().flags;
                if (Build.VERSION.SDK_INT < 28) {
                    i = 0;
                } else {
                    i = activity.getWindow().getAttributes().layoutInDisplayCutoutMode;
                }
                window2.getDecorView().setSystemUiVisibility(systemUiVisibility);
                window2.addFlags(i2);
                if (Build.VERSION.SDK_INT >= 28) {
                    window2.getAttributes().layoutInDisplayCutoutMode = i;
                }
            }
        }
    }

    private Item[] createAuthItemArray(List<AuthType> list) {
        ArrayList arrayList = new ArrayList();
        boolean contains = list.contains(AuthType.KAKAO_TALK);
        Integer valueOf = Integer.valueOf((int) R.drawable.bmw);
        if (contains) {
            arrayList.add(new Item(R.string.ai6, valueOf, R.string.ai7, AuthType.KAKAO_TALK));
        }
        if (list.contains(AuthType.KAKAO_TALK_ONLY)) {
            arrayList.add(new Item(R.string.ai6, valueOf, R.string.ai7, AuthType.KAKAO_TALK_ONLY));
        }
        if (list.contains(AuthType.KAKAO_STORY)) {
            arrayList.add(new Item(R.string.ai4, Integer.valueOf((int) R.drawable.blh), R.string.ai5, AuthType.KAKAO_STORY));
        }
        if (list.contains(AuthType.KAKAO_ACCOUNT)) {
            arrayList.add(new Item(R.string.aic, Integer.valueOf((int) R.drawable.c5), R.string.aid, AuthType.KAKAO_ACCOUNT));
        }
        return (Item[]) arrayList.toArray(new Item[0]);
    }

    public LoginButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(14305);
        MethodCollector.m26664o(14305);
    }

    /* access modifiers changed from: protected */
    public Dialog createLoginDialog(final Item[] itemArr, ListAdapter listAdapter) {
        final Dialog dialog = new Dialog(getContext(), R.style.fw);
        dialog.requestWindowFeature(1);
        applyFullscreenOptions(dialog);
        dialog.setContentView(R.layout.ag7);
        if (dialog.getWindow() != null) {
            dialog.getWindow().setGravity(17);
        }
        ListView listView = (ListView) dialog.findViewById(R.id.cgo);
        listView.setAdapter(listAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /* class com.kakao.usermgmt.LoginButton.C281103 */

            static {
                Covode.recordClassIndex(33987);
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                AuthType authType = itemArr[i].authType;
                if (authType != null) {
                    LoginButton.this.openSession(authType);
                }
                dialog.dismiss();
            }
        });
        ((Button) dialog.findViewById(R.id.cgk)).setOnClickListener(new View.OnClickListener() {
            /* class com.kakao.usermgmt.LoginButton.View$OnClickListenerC281114 */

            static {
                Covode.recordClassIndex(33988);
            }

            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        return dialog;
    }

    public LoginButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m26663i(14306);
        MethodCollector.m26664o(14306);
    }

    /* access modifiers changed from: package-private */
    public static class Item {
        final AuthType authType;
        final int contentDescId;
        public final int icon;
        final int textId;

        static {
            Covode.recordClassIndex(33989);
        }

        Item(int i, Integer num, int i2, AuthType authType2) {
            this.textId = i;
            this.icon = num.intValue();
            this.contentDescId = i2;
            this.authType = authType2;
        }
    }
}
