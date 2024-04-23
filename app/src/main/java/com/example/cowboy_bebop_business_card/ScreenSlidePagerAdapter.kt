import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.cowboy_bebop_business_card.FayeFragment
import com.example.cowboy_bebop_business_card.JetFragment
import com.example.cowboy_bebop_business_card.SpikeFragment

class ScreenSlidePagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> SpikeFragment()
            1 -> FayeFragment()
            2 -> JetFragment()
            else -> SpikeFragment() // Default to SpikeFragment if out of bounds
        }
    }
}
