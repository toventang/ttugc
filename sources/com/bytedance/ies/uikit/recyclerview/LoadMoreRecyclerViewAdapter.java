package com.bytedance.ies.uikit.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.recyclerview.LoadingStatusView;
import com.p2082ss.android.ugc.trill.R;

public abstract class LoadMoreRecyclerViewAdapter extends RecyclerViewWithFooterAdapter {
    public ILoadMore mLoadMoreListener;
    private LoadMoreViewHolder mLoadMoreViewHolder;

    public interface ILoadMore {
        static {
            Covode.recordClassIndex(20942);
        }

        void loadMore(boolean z);
    }

    static {
        Covode.recordClassIndex(20939);
    }

    /* access modifiers changed from: protected */
    public int getErrorLayoutForLoadMore() {
        return -1;
    }

    /* access modifiers changed from: protected */
    public int getLoadingLayoutForLoadMore() {
        return R.layout.ag5;
    }

    class LoadMoreViewHolder extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(20943);
        }

        public void reset() {
            ((LoadingStatusView) this.itemView).reset();
        }

        public void showError() {
            ((LoadingStatusView) this.itemView).showError();
        }

        public void showLoading() {
            ((LoadingStatusView) this.itemView).showLoading();
        }

        public void bind() {
            if (((LoadingStatusView) this.itemView).isReset() && LoadMoreRecyclerViewAdapter.this.mLoadMoreListener != null) {
                LoadMoreRecyclerViewAdapter.this.mLoadMoreListener.loadMore(false);
            }
        }

        public LoadMoreViewHolder(View view) {
            super(view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.bytedance.ies.uikit.recyclerview.RecyclerViewWithFooterAdapter
    public final int getItemCount() {
        if (getBasicItemCount() == 0) {
            return 0;
        }
        return super.getItemCount();
    }

    public void resetLoadMoreState() {
        LoadMoreViewHolder loadMoreViewHolder = this.mLoadMoreViewHolder;
        if (loadMoreViewHolder != null) {
            loadMoreViewHolder.reset();
        }
    }

    public void showLoadMoreError() {
        LoadMoreViewHolder loadMoreViewHolder = this.mLoadMoreViewHolder;
        if (loadMoreViewHolder != null) {
            loadMoreViewHolder.showError();
        }
    }

    public void showLoadMoreLoading() {
        LoadMoreViewHolder loadMoreViewHolder = this.mLoadMoreViewHolder;
        if (loadMoreViewHolder != null) {
            loadMoreViewHolder.showLoading();
        }
    }

    public void setLoadMoreListener(ILoadMore iLoadMore) {
        this.mLoadMoreListener = iLoadMore;
    }

    /* access modifiers changed from: protected */
    public int getFooterHeight(View view) {
        return view.getResources().getDimensionPixelSize(R.dimen.gz);
    }

    @Override // com.bytedance.ies.uikit.recyclerview.RecyclerViewWithFooterAdapter
    public void onBindFooterViewHolder(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof LoadMoreViewHolder) {
            ((LoadMoreViewHolder) viewHolder).bind();
            RecyclerView.C1367j jVar = (RecyclerView.C1367j) this.mLoadMoreViewHolder.itemView.getLayoutParams();
            if (jVar instanceof StaggeredGridLayoutManager.C1385b) {
                ((StaggeredGridLayoutManager.C1385b) jVar).f4602b = true;
            }
            this.mLoadMoreViewHolder.itemView.setLayoutParams(jVar);
        }
    }

    @Override // com.bytedance.ies.uikit.recyclerview.RecyclerViewWithFooterAdapter
    public RecyclerView.ViewHolder onCreateFooterViewHolder(ViewGroup viewGroup) {
        LoadingStatusView loadingStatusView = new LoadingStatusView(viewGroup.getContext());
        int footerHeight = getFooterHeight(viewGroup);
        int dimensionPixelSize = viewGroup.getResources().getDimensionPixelSize(R.dimen.h0);
        loadingStatusView.setLayoutParams(getFooterLayoutParams(-1, footerHeight));
        LoadingStatusView.Builder builder = new LoadingStatusView.Builder(viewGroup.getContext());
        builder.setUseProgressBar(dimensionPixelSize).setErrorText(R.string.cxh, new View.OnClickListener() {
            /* class com.bytedance.ies.uikit.recyclerview.LoadMoreRecyclerViewAdapter.View$OnClickListenerC182771 */

            static {
                Covode.recordClassIndex(20940);
            }

            public void onClick(View view) {
                if (LoadMoreRecyclerViewAdapter.this.mLoadMoreListener != null) {
                    LoadMoreRecyclerViewAdapter.this.mLoadMoreListener.loadMore(true);
                }
            }
        });
        if (getErrorLayoutForLoadMore() > 0) {
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), getErrorLayoutForLoadMore(), viewGroup, false);
            a.setOnClickListener(new View.OnClickListener() {
                /* class com.bytedance.ies.uikit.recyclerview.LoadMoreRecyclerViewAdapter.View$OnClickListenerC182782 */

                static {
                    Covode.recordClassIndex(20941);
                }

                public void onClick(View view) {
                    if (LoadMoreRecyclerViewAdapter.this.mLoadMoreListener != null) {
                        LoadMoreRecyclerViewAdapter.this.mLoadMoreListener.loadMore(true);
                    }
                }
            });
            builder.setErrorView(a);
        }
        builder.setLoadingView(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), getLoadingLayoutForLoadMore(), viewGroup, false));
        loadingStatusView.setBuilder(builder);
        LoadMoreViewHolder loadMoreViewHolder = new LoadMoreViewHolder(loadingStatusView);
        this.mLoadMoreViewHolder = loadMoreViewHolder;
        return loadMoreViewHolder;
    }

    /* access modifiers changed from: protected */
    public RecyclerView.C1367j getFooterLayoutParams(int i, int i2) {
        return new RecyclerView.C1367j(i, i2);
    }
}
