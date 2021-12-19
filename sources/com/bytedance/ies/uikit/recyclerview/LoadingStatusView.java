package com.bytedance.ies.uikit.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.github.rahatarmanahmed.cpv.CircularProgressView;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

public class LoadingStatusView extends FrameLayout {
    private final String TAG;
    private int mStatus;
    List<View> mStatusViews;

    static {
        Covode.recordClassIndex(20944);
    }

    public void showEmpty() {
        setStatus(1);
    }

    public void showError() {
        setStatus(2);
    }

    public void showLoading() {
        setStatus(0);
    }

    public boolean isReset() {
        if (this.mStatus == -1) {
            return true;
        }
        return false;
    }

    public static class Builder {
        Context mContext;
        View mEmptyView;
        View mErrorView;
        View mLoadingView;

        static {
            Covode.recordClassIndex(20945);
        }

        private CircularProgressView createProgressView() {
            MethodCollector.m26663i(13192);
            CircularProgressView circularProgressView = (CircularProgressView) LayoutInflater.from(this.mContext).inflate(R.layout.ajp, (ViewGroup) null);
            MethodCollector.m26664o(13192);
            return circularProgressView;
        }

        public Builder setEmptyView(View view) {
            this.mEmptyView = view;
            return this;
        }

        public Builder setErrorView(View view) {
            this.mErrorView = view;
            return this;
        }

        public Builder setLoadingView(View view) {
            this.mLoadingView = view;
            return this;
        }

        public Builder(Context context) {
            if (context != null) {
                this.mContext = context;
                return;
            }
            throw new IllegalArgumentException("LoadingStatusView.Builder:Context can not be null");
        }

        public Builder setLoadingText(int i) {
            return setLoadingView(createDefaultView(i));
        }

        public static Builder createDefaultBuilder(Context context) {
            return new Builder(context).setEmptyText(R.string.cxi).setLoadingText(R.string.cxk).setErrorText(R.string.cxj, null);
        }

        private View createDefaultView(int i) {
            MethodCollector.m26663i(13125);
            TextView textView = (TextView) LayoutInflater.from(this.mContext).inflate(R.layout.ajq, (ViewGroup) null);
            textView.setText(i);
            MethodCollector.m26664o(13125);
            return textView;
        }

        public Builder setEmptyText(int i) {
            MethodCollector.m26663i(13044);
            TextView textView = (TextView) LayoutInflater.from(this.mContext).inflate(R.layout.bif, (ViewGroup) null);
            textView.setText(i);
            Builder emptyView = setEmptyView(textView);
            MethodCollector.m26664o(13044);
            return emptyView;
        }

        public Builder setUseProgressBar(int i) {
            CircularProgressView createProgressView = createProgressView();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.height = i;
            layoutParams.width = i;
            layoutParams.gravity = 17;
            createProgressView.setLayoutParams(layoutParams);
            return setLoadingView(createProgressView);
        }

        public Builder setErrorText(int i, View.OnClickListener onClickListener) {
            View createDefaultView = createDefaultView(i);
            createDefaultView.setOnClickListener(onClickListener);
            return setErrorView(createDefaultView);
        }
    }

    public void reset() {
        int i = this.mStatus;
        if (i != -1) {
            this.mStatusViews.get(i).setVisibility(4);
            this.mStatus = -1;
        }
    }

    public LoadingStatusView(Context context) {
        this(context, null);
    }

    private void setStatus(int i) {
        int i2 = this.mStatus;
        if (i2 != i) {
            if (i2 >= 0) {
                this.mStatusViews.get(i2).setVisibility(4);
            }
            if (this.mStatusViews.get(i) != null) {
                this.mStatusViews.get(i).setVisibility(0);
                this.mStatus = i;
            }
        }
    }

    public void setBuilder(Builder builder) {
        MethodCollector.m26663i(14037);
        if (builder == null) {
            builder = Builder.createDefaultBuilder(getContext());
        }
        this.mStatusViews.clear();
        this.mStatusViews.add(builder.mLoadingView);
        this.mStatusViews.add(builder.mEmptyView);
        this.mStatusViews.add(builder.mErrorView);
        removeAllViews();
        for (int i = 0; i < this.mStatusViews.size(); i++) {
            View view = this.mStatusViews.get(i);
            if (view != null) {
                view.setVisibility(4);
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                addView(view);
            }
        }
        MethodCollector.m26664o(14037);
    }

    public LoadingStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LoadingStatusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m26663i(14019);
        this.TAG = LoadingStatusView.class.getSimpleName();
        this.mStatusViews = new ArrayList(3);
        this.mStatus = -1;
        setBuilder(null);
        MethodCollector.m26664o(14019);
    }
}
