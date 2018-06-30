package app.refactoring.com.refactoringretrofit.util;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * unknown at 2018/6/20
 */

public class RecyclerViewDivider extends RecyclerView.ItemDecoration {
    private float mDividerHeight;
    private Paint mPaint;

    public RecyclerViewDivider() {
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.RED);
    }

//    @Override
//    public void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {
//        super.onDraw(c, parent, state);
//        int childCount = parent.getChildCount();
//
//        for (int i = 0; i < childCount; i++) {
//            View view = parent.getChildAt(i);
//
//            int index = parent.getChildAdapterPosition(view);
//            //第一个ItemView不需要绘制
//            if (index == 0) {
//                continue;
//            }
//            int top = view.getTop();
//            float dividerTop = view.getTop() - mDividerHeight;
//            float dividerLeft = parent.getPaddingLeft();
//            float dividerBottom = view.getTop();
//            float dividerRight = parent.getWidth() - parent.getPaddingRight();
//
//            c.drawRect(dividerLeft, dividerTop, dividerRight, dividerBottom, mPaint);
//        }
//    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        if (parent.getChildAdapterPosition(view) != 0) {
            outRect.top = 5;
            outRect.left = 5;
//            mDividerHeight = 5;
        }
    }
}
