package com.just.library;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/**
 * <b>@项目名：</b> agentweb<br>
 * <b>@包名：</b>com.just.library<br>
 * <b>@创建者：</b> cxz --  just<br>
 * <b>@创建时间：</b> &{DATE}<br>
 * <b>@公司：</b> 宝诺科技<br>
 * <b>@邮箱：</b> cenxiaozhong.qqcom@qq.com<br>
 * <b>@描述</b><br>
 *     source CODE  https://github.com/Justson/AgentWeb
 */

public class ChromeClientProgress extends WebChromeClient {

    private IndicatorController mIndicatorController = null;

    public ChromeClientProgress(IndicatorController indicatorController) {
        this.mIndicatorController = indicatorController;
    }

    @Override
    public void onProgressChanged(WebView view, int newProgress) {
       // super.onProgressChanged(view,newProgress);
        if (mIndicatorController != null)
            mIndicatorController.progress(view, newProgress);
    }

}
