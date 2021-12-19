package com.bytedance.router;

import android.content.Intent;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;

public class FakeFragment extends Fragment {
    private OnActivityResultCallback mCallback;

    static {
        Covode.recordClassIndex(25808);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.mCallback = null;
    }

    public void setCallback(OnActivityResultCallback onActivityResultCallback) {
        this.mCallback = onActivityResultCallback;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        OnActivityResultCallback onActivityResultCallback = this.mCallback;
        if (onActivityResultCallback != null) {
            onActivityResultCallback.onActivityResult(i, i2, intent);
            this.mCallback = null;
        }
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            activity.getSupportFragmentManager().mo3552a().mo3455a(this).mo3476d();
        }
    }
}
