
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.donutsapp.presentation.screens.storeScreen.StoreScreenState
import com.washingtondcsquad.tudee.presentation.utils.modifierExensions.dropShadow
import kotlin.uuid.ExperimentalUuidApi


@OptIn(ExperimentalUuidApi::class)
@Composable
fun DonutsCard(
    donuts: StoreScreenState,
    backgroundColor: Color,
    onFavoriteClick: ()-> Unit,
    onCardClick: ()-> Unit,
    isFavorite: Boolean,

    ) {


    Box(
        modifier = Modifier.width(200.dp)

    ) {
        Column(
            modifier = Modifier
                .dropShadow(
                    color = Color(0xFF000000).copy(0.25f),
                    blur = 4.dp,
                    shape = RoundedCornerShape(20.dp),
                    offsetY = -4.dp,
                    offsetX = 0.dp,
                )
                .clip(RoundedCornerShape(20.dp))
                .background(backgroundColor)
                .clickable { onCardClick() }
                .padding(15.dp)

        ) {
            IconButton(
                onClick = { onFavoriteClick() },
                colors = IconButtonDefaults.iconButtonColors(Color.White)

                ) {
                Icon(
                    modifier = Modifier.size(30.dp),
                    imageVector = if (isFavorite) Icons.Filled.Favorite else Icons.Outlined.FavoriteBorder,
                    contentDescription = "home icon",
                    tint = Color(0xFFFC6F73)
                )
            }
            Spacer(Modifier.height(118.dp))
            Text(
                text = donuts.title,
                color = Color(0xFF000000),
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
            )
            Spacer(Modifier.height(8.dp))
            Text(
                text = donuts.description.toString(),
                color = Color(0x99000000),
                fontSize = 12.sp,
                fontWeight = FontWeight.Normal,
                lineHeight = 15.sp
            )
            Spacer(Modifier.height(4.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.Bottom
            ) {
                Text(
                    text = "$${donuts.price}",
                    color = Color(0x99000000),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    lineHeight = 17.sp,
                    textDecoration = TextDecoration.LineThrough
                )
                Spacer(Modifier.width(4.dp))

                Text(
                    text = "$${donuts.salePrice}",
                    color = Color(0xFF000000),
                    fontSize = 22.sp,
                    fontWeight = FontWeight.SemiBold,
                    lineHeight = 27.sp
                )
            }


        }
        Image(
            painter = painterResource(donuts.image!!),
            contentDescription = "Strawberry donuts",
            modifier = Modifier.offset(x = 60.dp)

        )
    }
}