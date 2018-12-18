package br.com.charleston.doghero.features

import androidx.lifecycle.ViewModelProviders
import br.com.charleston.doghero.core.base.BaseFragment
import br.com.charleston.doghero.R
import br.com.charleston.doghero.databinding.FragmentMyHeroesBinding

class MyHeroesFragment : BaseFragment<FragmentMyHeroesBinding, HeroViewModel>() {

    override fun getLayoutId(): Int {
        return R.layout.fragment_my_heroes
    }

    override fun getViewModel(): HeroViewModel {
        return ViewModelProviders
            .of(this, viewModelFactory)
            .get(HeroViewModel::class.java)
    }
}